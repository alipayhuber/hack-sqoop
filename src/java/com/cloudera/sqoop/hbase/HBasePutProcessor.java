/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloudera.sqoop.hbase;

/**
 * @deprecated Moving to use org.apache.sqoop namespace.
 */
public class HBasePutProcessor
    extends org.apache.sqoop.hbase.HBasePutProcessor {

  public static final String TABLE_NAME_KEY =
      org.apache.sqoop.hbase.HBasePutProcessor.TABLE_NAME_KEY;
  public static final String COL_FAMILY_KEY =
      org.apache.sqoop.hbase.HBasePutProcessor.COL_FAMILY_KEY;
  public static final String ROW_KEY_COLUMN_KEY =
      org.apache.sqoop.hbase.HBasePutProcessor.ROW_KEY_COLUMN_KEY;
  public static final String TRANSFORMER_CLASS_KEY =
      org.apache.sqoop.hbase.HBasePutProcessor.TRANSFORMER_CLASS_KEY;

}
