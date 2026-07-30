package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public class nnc0 implements tpx {
    @Override // p149l.tpx
    /* JADX INFO: renamed from: a */
    public View mo160198a(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(c6c0.f79465E, (ViewGroup) null);
        VImage vImage = (VImage) viewInflate.findViewById(q4c0.f152616v);
        uqd0 uqd0Var = saf0.f163352T;
        if (NullChecker.m81303a(uqd0Var)) {
            vImage.setImageResource(TextUtils.equals(uqd0Var.get(), "male") ? v2c0.f179495o0 : v2c0.f179492n0);
        }
        return viewInflate;
    }
}
