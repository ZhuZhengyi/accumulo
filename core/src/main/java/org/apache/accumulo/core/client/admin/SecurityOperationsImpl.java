/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.accumulo.core.client.admin;

import org.apache.accumulo.core.client.Instance;
import org.apache.accumulo.core.security.Credentials;
import org.apache.accumulo.core.security.thrift.TCredentials;

/**
 * @deprecated since 1.6.0; not intended for public api and you should not use it.
 */
@Deprecated
public class SecurityOperationsImpl extends org.apache.accumulo.core.client.impl.SecurityOperationsImpl {

  public SecurityOperationsImpl(Instance instance, Credentials credentials) {
    super(instance, credentials);
  }

  public SecurityOperationsImpl(Instance instance, TCredentials credentials) {
    this(instance, Credentials.fromThrift(credentials));
  }
}
