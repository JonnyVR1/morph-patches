package org.eclipse.jetty.security;

import org.eclipse.jetty.util.security.Constraint;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ConstraintMapping {
    Constraint _constraint;
    String _method;
    String[] _methodOmissions;
    String _pathSpec;

    public Constraint getConstraint() {
        return this._constraint;
    }

    public String getMethod() {
        return this._method;
    }

    public String[] getMethodOmissions() {
        return this._methodOmissions;
    }

    public String getPathSpec() {
        return this._pathSpec;
    }

    public void setConstraint(Constraint constraint) {
        this._constraint = constraint;
    }

    public void setMethod(String str) {
        this._method = str;
    }

    public void setMethodOmissions(String[] strArr) {
        this._methodOmissions = strArr;
    }

    public void setPathSpec(String str) {
        this._pathSpec = str;
    }
}
