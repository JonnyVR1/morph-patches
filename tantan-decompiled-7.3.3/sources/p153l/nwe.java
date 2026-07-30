package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import p151v.VEditText;
import p151v.VImage;
import p151v.VLinear;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class nwe {
    /* JADX INFO: renamed from: a */
    public static void m164987a(mwe mweVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mweVar.f139065c = (VScroll) viewGroup.getChildAt(0);
        mweVar.f139066d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        mweVar.f139067e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        mweVar.f139068f = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        mweVar.f139069g = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        mweVar.f139070h = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2)).getChildAt(1);
        mweVar.f139071i = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        mweVar.f139072j = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        mweVar.f139073k = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(1);
        mweVar.f139074l = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        mweVar.f139075m = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        mweVar.f139076n = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(0);
        mweVar.f139077o = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4)).getChildAt(1);
        mweVar.f139078p = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(0);
        mweVar.f139079q = (AnimEffectPlayer) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5)).getChildAt(1);
        mweVar.f139080r = (LinearLayout) viewGroup.getChildAt(1);
        mweVar.f139081s = (VText) viewGroup.getChildAt(2);
        mweVar.f139082t = (ConstraintLayout) viewGroup.getChildAt(3);
        mweVar.f139083u = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        mweVar.f139084v = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        mweVar.f139085w = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        mweVar.f139086x = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m164988b(mwe mweVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109131q, viewGroup, false);
        m164987a(mweVar, viewInflate);
        return viewInflate;
    }
}
