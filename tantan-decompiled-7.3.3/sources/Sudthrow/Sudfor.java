package Sudthrow;

import java.nio.charset.CharacterCodingException;

/* JADX INFO: loaded from: classes.dex */
public class Sudfor extends Exception {

    /* JADX INFO: renamed from: Suddo, reason: collision with root package name */
    public final int f211032Suddo;

    public Sudfor(CharacterCodingException characterCodingException) {
        super(characterCodingException);
        this.f211032Suddo = 1007;
    }

    public Sudfor(int i, String str) {
        super(str);
        this.f211032Suddo = i;
    }

    public Sudfor(int i) {
        this.f211032Suddo = i;
    }
}
