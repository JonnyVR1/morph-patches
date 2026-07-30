package p153l;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.api.Api;

/* JADX INFO: loaded from: classes.dex */
public final class kye {

    /* JADX INFO: renamed from: a */
    public final C18301b f129301a;

    /* JADX INFO: renamed from: b */
    public int f129302b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: c */
    public int f129303c = 0;

    /* JADX INFO: renamed from: l.kye$a */
    @RequiresApi(19)
    public static class C18300a extends C18301b {

        /* JADX INFO: renamed from: a */
        public final EditText f129304a;

        /* JADX INFO: renamed from: b */
        public final lze f129305b;

        public C18300a(@NonNull EditText editText) {
            this.f129304a = editText;
            lze lzeVar = new lze(editText);
            this.f129305b = lzeVar;
            editText.addTextChangedListener(lzeVar);
            editText.setEditableFactory(lye.getInstance());
        }

        @Override // p153l.kye.C18301b
        /* JADX INFO: renamed from: a */
        public KeyListener mo151965a(@NonNull KeyListener keyListener) {
            return keyListener instanceof wye ? keyListener : new wye(keyListener);
        }

        @Override // p153l.kye.C18301b
        /* JADX INFO: renamed from: b */
        public InputConnection mo151966b(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            return inputConnection instanceof uye ? inputConnection : new uye(this.f129304a, inputConnection, editorInfo);
        }

        @Override // p153l.kye.C18301b
        /* JADX INFO: renamed from: c */
        public void mo151967c(int i) {
            this.f129305b.m156431b(i);
        }

        @Override // p153l.kye.C18301b
        /* JADX INFO: renamed from: d */
        public void mo151968d(int i) {
            this.f129305b.m156432c(i);
        }
    }

    /* JADX INFO: renamed from: l.kye$b */
    public static class C18301b {
        /* JADX INFO: renamed from: a */
        public KeyListener mo151965a(@NonNull KeyListener keyListener) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public InputConnection mo151966b(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public void mo151967c(int i) {
            throw null;
        }

        /* JADX INFO: renamed from: d */
        public void mo151968d(int i) {
            throw null;
        }
    }

    public kye(@NonNull EditText editText) {
        yn80.m216776f(editText, "editText cannot be null");
        this.f129301a = new C18300a(editText);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: a */
    public int m151959a() {
        return this.f129303c;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public KeyListener m151960b(@NonNull KeyListener keyListener) {
        yn80.m216776f(keyListener, "keyListener cannot be null");
        return this.f129301a.mo151965a(keyListener);
    }

    /* JADX INFO: renamed from: c */
    public int m151961c() {
        return this.f129302b;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public InputConnection m151962d(@Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f129301a.mo151966b(inputConnection, editorInfo);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: e */
    public void m151963e(int i) {
        this.f129303c = i;
        this.f129301a.mo151967c(i);
    }

    /* JADX INFO: renamed from: f */
    public void m151964f(@IntRange(from = 0) int i) {
        yn80.m216774d(i, "maxEmojiCount should be greater than 0");
        this.f129302b = i;
        this.f129301a.mo151968d(i);
    }
}
