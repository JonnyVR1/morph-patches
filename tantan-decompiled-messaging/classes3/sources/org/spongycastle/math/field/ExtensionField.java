package org.spongycastle.math.field;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface ExtensionField extends FiniteField {
    int getDegree();

    FiniteField getSubfield();
}
