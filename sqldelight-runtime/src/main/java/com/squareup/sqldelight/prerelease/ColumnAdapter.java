/*
 * Copyright (C) 2016 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.sqldelight.prerelease;

import androidx.annotation.NonNull;

/**
 * Marshal and map the type {@code T} to and from a database type {@code S} which is one of
 * {@code Long}, {@code Double}, {@code String}, {@code byte[]}.
 */
public interface ColumnAdapter<T, S> {
  @NonNull T decode(S databaseValue);
  S encode(@NonNull T value);
}