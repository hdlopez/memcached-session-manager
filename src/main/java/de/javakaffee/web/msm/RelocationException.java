/*
 * Copyright 2009 Martin Grotzke
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package de.javakaffee.web.msm;

/**
 * This exception is thrown when a node is not available but the session
 * can be moved to another node.
 * 
 * @author <a href="mailto:martin.grotzke@freiheit.com">Martin Grotzke</a>
 * @version $Id$
 */
public class RelocationException extends RuntimeException {

    private static final long serialVersionUID = 5954872380654336225L;
    
    private final String _targetNodeId;

    public RelocationException( String msg, String targetNodeId ) {
        super( msg );
        _targetNodeId = targetNodeId;
    }

    /**
     * @return the targetNodeId
     */
    public String getTargetNodeId() {
        return _targetNodeId;
    }

    /* (non-Javadoc)
     * @see java.lang.Throwable#fillInStackTrace()
     */
    @Override
    public synchronized Throwable fillInStackTrace() {
        /* we don't need this, saving time... */
        return null;
    }

}
