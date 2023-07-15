/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0 and the Server Side Public License, v 1; you may not use this file except
 * in compliance with, at your election, the Elastic License 2.0 or the Server
 * Side Public License, v 1.
 */

package org.elasticsearch.plugins.cli;

/**
 * Thrown when a problem occurs synchronising plugins.
 */
class PluginSyncException extends Exception {

    PluginSyncException(String message) {
        super(message);
    }

    PluginSyncException(String message, Throwable cause) {
        super(message, cause);
    }
}
// Test
// Test2
