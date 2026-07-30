package p006l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import l.tpx;
import l.uqd0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class nnc0 implements tpx {
    /* JADX INFO: renamed from: a */
    public View m20168a(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(c6c0.f9395E, (ViewGroup) null);
        VImage vImageFindViewById = viewInflate.findViewById(q4c0.f19626v);
        viewInflate.findViewById(q4c0.f19604f0);
        viewInflate.findViewById(q4c0.f19602e0);
        uqd0 uqd0Var = saf0.f21175T;
        if (NullChecker.a(uqd0Var)) {
            vImageFindViewById.setImageResource(TextUtils.equals((CharSequence) uqd0Var.get(), "male") ? v2c0.f24059o0 : v2c0.f24056n0);
        }
        return viewInflate;
    }
}
