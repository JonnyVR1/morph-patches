package p149l;

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
public final class gxe {

    /* JADX INFO: renamed from: a */
    public final C17194b f104870a;

    /* JADX INFO: renamed from: b */
    public int f104871b = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: c */
    public int f104872c = 0;

    /* JADX INFO: renamed from: l.gxe$a */
    @RequiresApi(19)
    public static class C17193a extends C17194b {

        /* JADX INFO: renamed from: a */
        public final EditText f104873a;

        /* JADX INFO: renamed from: b */
        public final hye f104874b;

        public C17193a(@NonNull EditText editText) {
            this.f104873a = editText;
            hye hyeVar = new hye(editText);
            this.f104874b = hyeVar;
            editText.addTextChangedListener(hyeVar);
            editText.setEditableFactory(hxe.getInstance());
        }

        @Override // p149l.gxe.C17194b
        /* JADX INFO: renamed from: a */
        public KeyListener mo128562a(@NonNull KeyListener keyListener) {
            return keyListener instanceof sxe ? keyListener : new sxe(keyListener);
        }

        @Override // p149l.gxe.C17194b
        /* JADX INFO: renamed from: b */
        public InputConnection mo128563b(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            return inputConnection instanceof qxe ? inputConnection : new qxe(this.f104873a, inputConnection, editorInfo);
        }

        @Override // p149l.gxe.C17194b
        /* JADX INFO: renamed from: c */
        public void mo128564c(int i) {
            this.f104874b.m133608b(i);
        }

        @Override // p149l.gxe.C17194b
        /* JADX INFO: renamed from: d */
        public void mo128565d(int i) {
            this.f104874b.m133609c(i);
        }
    }

    /* JADX INFO: renamed from: l.gxe$b */
    public static class C17194b {
        /* JADX INFO: renamed from: a */
        public KeyListener mo128562a(@NonNull KeyListener keyListener) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public InputConnection mo128563b(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public void mo128564c(int i) {
            throw null;
        }

        /* JADX INFO: renamed from: d */
        public void mo128565d(int i) {
            throw null;
        }
    }

    public gxe(@NonNull EditText editText) {
        tf80.m188659f(editText, "editText cannot be null");
        this.f104870a = new C17193a(editText);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: a */
    public int m128556a() {
        return this.f104872c;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public KeyListener m128557b(@NonNull KeyListener keyListener) {
        tf80.m188659f(keyListener, "keyListener cannot be null");
        return this.f104870a.mo128562a(keyListener);
    }

    /* JADX INFO: renamed from: c */
    public int m128558c() {
        return this.f104871b;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public InputConnection m128559d(@Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f104870a.mo128563b(inputConnection, editorInfo);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: e */
    public void m128560e(int i) {
        this.f104872c = i;
        this.f104870a.mo128564c(i);
    }

    /* JADX INFO: renamed from: f */
    public void m128561f(@IntRange(from = 0) int i) {
        tf80.m188657d(i, "maxEmojiCount should be greater than 0");
        this.f104871b = i;
        this.f104870a.mo128565d(i);
    }
}
