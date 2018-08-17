/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsets.pipeline.stage.origin.hive_jdbc.cdc.sqlserver;

import com.streamsets.pipeline.api.ConfigDef;

public class CDCTableConfigBean {
  @ConfigDef(
      required = false,
      type = ConfigDef.Type.STRING,
      label = "Schema",
      description = "Schema Name",
      displayPosition = 20,
      group = "TABLE"
  )
  public String schema;

  @ConfigDef(
      required = true,
      type = ConfigDef.Type.STRING,
      label = "Table Name Pattern",
      description = "Pattern of the table names to read. Use a SQL like syntax.",
      displayPosition = 30,
      defaultValue = "%",
      group = "TABLE"
  )
  public String tablePattern;

  @ConfigDef(
      required = false,
      type = ConfigDef.Type.STRING,
      label = "Table Exclusion Pattern",
      description = "Pattern of the table names to exclude from being read. Use a Java regex syntax." +
          " Leave empty if no exclusion needed.",
      displayPosition = 40,
      group = "TABLE"
  )
  public String tableExclusionPattern;

  @ConfigDef(
      required = false,
      type = ConfigDef.Type.STRING,
      label = "Initial Offset",
      description = "Use -1 to process all data or use the last-saved offset",
      displayPosition =  50,
      group = "TABLE"
  )
  public String initialOffset;
}
