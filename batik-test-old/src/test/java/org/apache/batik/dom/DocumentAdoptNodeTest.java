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
package org.apache.batik.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Tests Document.adoptNode.
 *
 * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a>
 * @version $Id: DocumentAdoptNodeTest.java 1831630 2018-05-15 12:56:55Z ssteiner $
 */
public class DocumentAdoptNodeTest extends DOM3Test {
    public boolean runImplBasic() throws Exception {
        Document doc1 = newSVGDoc();
        Document doc2 = newSVGDoc();
        Element e = doc2.getDocumentElement();
        e.setAttributeNS(EX_NAMESPACE_URI, "test", "blah");
        doc1.adoptNode(e);
        return e.getOwnerDocument() == doc1
            && e.getAttributeNodeNS(EX_NAMESPACE_URI, "test").getOwnerDocument() == doc1;
    }
}
