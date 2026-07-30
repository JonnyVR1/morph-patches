package p153l;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class kze {

    /* JADX INFO: renamed from: a */
    public final C18314b f129402a;

    /* JADX INFO: renamed from: l.kze$a */
    @RequiresApi(19)
    public static class C18313a extends C18314b {

        /* JADX INFO: renamed from: a */
        public final TextView f129403a;

        /* JADX INFO: renamed from: b */
        public final vye f129404b;

        public C18313a(TextView textView) {
            this.f129403a = textView;
            this.f129404b = new vye(textView);
        }

        @Override // p153l.kze.C18314b
        /* JADX INFO: renamed from: a */
        public InputFilter[] mo152169a(@NonNull InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter instanceof vye) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f129404b;
            return inputFilterArr2;
        }

        @Override // p153l.kze.C18314b
        /* JADX INFO: renamed from: b */
        public void mo152170b(boolean z) {
            if (z) {
                mo152171c();
            }
        }

        @Override // p153l.kze.C18314b
        /* JADX INFO: renamed from: c */
        public void mo152171c() {
            TransformationMethod transformationMethod = this.f129403a.getTransformationMethod();
            if (transformationMethod == null || (transformationMethod instanceof PasswordTransformationMethod)) {
                return;
            }
            this.f129403a.setTransformationMethod(m152172d(transformationMethod));
        }

        /* JADX INFO: renamed from: d */
        public TransformationMethod m152172d(TransformationMethod transformationMethod) {
            return transformationMethod instanceof mze ? transformationMethod : new mze(transformationMethod);
        }
    }

    /* JADX INFO: renamed from: l.kze$b */
    public static class C18314b {
        /* JADX INFO: renamed from: a */
        public InputFilter[] mo152169a(@NonNull InputFilter[] inputFilterArr) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public void mo152170b(boolean z) {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public void mo152171c() {
            throw null;
        }
    }

    public kze(@NonNull TextView textView) {
        yn80.m216776f(textView, "textView cannot be null");
        this.f129402a = new C18313a(textView);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public InputFilter[] m152166a(@NonNull InputFilter[] inputFilterArr) {
        return this.f129402a.mo152169a(inputFilterArr);
    }

    /* JADX INFO: renamed from: b */
    public void m152167b(boolean z) {
        this.f129402a.mo152170b(z);
    }

    /* JADX INFO: renamed from: c */
    public void m152168c() {
        this.f129402a.mo152171c();
    }
}
