package org.eclipse.jetty.security;

import p003l.k250;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public enum UserDataConstraint {
    None,
    Integral,
    Confidential;

    public static UserDataConstraint get(int i) {
        if (i >= -1 && i <= 2) {
            return i == -1 ? None : values()[i];
        }
        k250.m5546a("Expected -1, 0, 1, or 2, not: ", i);
        return null;
    }

    public UserDataConstraint combine(UserDataConstraint userDataConstraint) {
        return compareTo(userDataConstraint) < 0 ? this : userDataConstraint;
    }
}
