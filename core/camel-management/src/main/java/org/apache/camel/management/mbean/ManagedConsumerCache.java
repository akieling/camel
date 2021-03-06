/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.management.mbean;

import org.apache.camel.CamelContext;
import org.apache.camel.api.management.ManagedResource;
import org.apache.camel.api.management.mbean.ManagedConsumerCacheMBean;
import org.apache.camel.spi.ConsumerCache;

@ManagedResource(description = "Managed ConsumerCache")
public class ManagedConsumerCache extends ManagedService implements ManagedConsumerCacheMBean {
    private final ConsumerCache consumerCache;

    public ManagedConsumerCache(CamelContext context, ConsumerCache consumerCache) {
        super(context, consumerCache);
        this.consumerCache = consumerCache;
    }

    public ConsumerCache getConsumerCache() {
        return consumerCache;
    }

    @Override
    public String getSource() {
        if (consumerCache.getSource() != null) {
            return consumerCache.getSource().toString();
        }
        return null;
    }

    @Override
    public Integer getSize() {
        return consumerCache.size();
    }

    @Override
    public Integer getMaximumCacheSize() {
        return consumerCache.getCapacity();
    }

    @Override
    public Long getHits() {
        return consumerCache.getHits();
    }

    @Override
    public Long getMisses() {
        return consumerCache.getMisses();
    }

    @Override
    public Long getEvicted() {
        return consumerCache.getEvicted();
    }

    @Override
    public void resetStatistics() {
        consumerCache.resetCacheStatistics();
    }

    @Override
    public void purge() {
        consumerCache.purge();
    }

}
