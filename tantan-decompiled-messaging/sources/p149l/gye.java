package p149l;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class gye {

    /* JADX INFO: renamed from: a */
    public final C17203b f105008a;

    /* JADX INFO: renamed from: l.gye$a */
    @RequiresApi(19)
    public static class C17202a extends C17203b {

        /* JADX INFO: renamed from: a */
        public final TextView f105009a;

        /* JADX INFO: renamed from: b */
        public final rxe f105010b;

        public C17202a(TextView textView) {
            this.f105009a = textView;
            this.f105010b = new rxe(textView);
        }

        @Override // p149l.gye.C17203b
        /* JADX INFO: renamed from: a */
        public InputFilter[] mo128702a(@NonNull InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter instanceof rxe) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f105010b;
            return inputFilterArr2;
        }

        @Override // p149l.gye.C17203b
        /* JADX INFO: renamed from: b */
        public void mo128703b(boolean z) {
            if (z) {
                mo128704c();
            }
        }

        @Override // p149l.gye.C17203b
        /* JADX INFO: renamed from: c */
        public void mo128704c() {
            TransformationMethod transformationMethod = this.f105009a.getTransformationMethod();
            if (transformationMethod == null || (transformationMethod instanceof PasswordTransformationMethod)) {
                return;
            }
            this.f105009a.setTransformationMethod(m128705d(transformationMethod));
        }

        /* JADX INFO: renamed from: d */
        public TransformationMethod m128705d(TransformationMethod transformationMethod) {
            return transformationMethod instanceof iye ? transformationMethod : new iye(transformationMethod);
        }
    }

    /* JADX INFO: renamed from: l.gye$b */
    public static class C17203b {
        /* JADX INFO: renamed from: a */
        public InputFilter[] mo128702a(@NonNull InputFilter[] inputFilterArr) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public void mo128703b(boolean z) {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public void mo128704c() {
            throw null;
        }
    }

    public gye(@NonNull TextView textView) {
        tf80.m188659f(textView, "textView cannot be null");
        this.f105008a = new C17202a(textView);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public InputFilter[] m128699a(@NonNull InputFilter[] inputFilterArr) {
        return this.f105008a.mo128702a(inputFilterArr);
    }

    /* JADX INFO: renamed from: b */
    public void m128700b(boolean z) {
        this.f105008a.mo128703b(z);
    }

    /* JADX INFO: renamed from: c */
    public void m128701c() {
        this.f105008a.mo128704c();
    }
}
