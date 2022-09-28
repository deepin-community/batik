/*

   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

 */
package org.apache.batik.anim.dom;

import org.apache.batik.dom.AbstractDocument;
import org.w3c.dom.Node;
import org.w3c.dom.svg.SVGMetadataElement;

/**
 * This class implements {@link org.w3c.dom.svg.SVGMetadataElement}.
 *
 * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a>
 * @version $Id: SVGOMMetadataElement.java 1733416 2016-03-03 07:07:13Z gadams $
 */
public class SVGOMMetadataElement
    extends    SVGOMElement
    implements SVGMetadataElement {
    /**
     * Creates a new SVGOMMetadataElement object.
     */
    protected SVGOMMetadataElement() {
    }

    /**
     * Creates a new SVGOMMetadataElement object.
     * @param prefix The namespace prefix.
     * @param owner The owner document.
     */
    public SVGOMMetadataElement(String prefix, AbstractDocument owner) {
        super(prefix, owner);
    }

    /**
     * <b>DOM</b>: Implements {@link org.w3c.dom.Node#getLocalName()}.
     */
    public String getLocalName() {
        return SVG_METADATA_TAG;
    }

    /**
     * Returns a new uninitialized instance of this object's class.
     */
    protected Node newNode() {
        return new SVGOMMetadataElement();
    }
}