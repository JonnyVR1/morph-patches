package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;

/* JADX INFO: loaded from: classes9.dex */
public class svc0 implements qyx {
    @Override // p153l.qyx
    /* JADX INFO: renamed from: a */
    public View mo178756a(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(hec0.f109077E, (ViewGroup) null);
        VImage vImage = (VImage) viewInflate.findViewById(wcc0.f188464v);
        wyd0 wyd0Var = zif0.f204509T;
        if (NullChecker.m82486a(wyd0Var)) {
            vImage.setImageResource(TextUtils.equals(wyd0Var.get(), "male") ? bbc0.f75901o0 : bbc0.f75898n0);
        }
        return viewInflate;
    }
}
