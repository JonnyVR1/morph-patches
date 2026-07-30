package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.BoostStartView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ka3 {
    /* JADX INFO: renamed from: a */
    public static void m148937a(BoostStartView boostStartView, View view) {
        boostStartView.f51643f = (BoostStartView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        boostStartView.f51644g = (VImage) viewGroup.getChildAt(0);
        boostStartView.f51645h = (VImage) viewGroup.getChildAt(1);
        boostStartView.f51646i = (VImage) viewGroup.getChildAt(2);
        boostStartView.f51647j = (VImage) viewGroup.getChildAt(3);
        boostStartView.f51648k = (VText) viewGroup.getChildAt(5);
        boostStartView.f51649l = (VText) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m148938b(BoostStartView boostStartView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199250t, viewGroup, false);
        m148937a(boostStartView, viewInflate);
        return viewInflate;
    }
}
