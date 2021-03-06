/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.expression.NestedStoreExpression;

public class ASTNestedStoreExpression extends AbstractApexNode<NestedStoreExpression> {

    public ASTNestedStoreExpression(NestedStoreExpression node) {
        super(node);
    }

    public Object jjtAccept(ApexParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
