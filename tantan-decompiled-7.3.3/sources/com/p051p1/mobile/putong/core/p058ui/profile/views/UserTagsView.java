package com.p051p1.mobile.putong.core.p058ui.profile.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p151v.VImage;
import p151v.VText;
import p153l.cum;
import p153l.ijk0;
import p153l.kec0;

/* JADX INFO: loaded from: classes4.dex */
public class UserTagsView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f35095a;

    /* JADX INFO: renamed from: b */
    public View f35096b;

    /* JADX INFO: renamed from: c */
    public VText f35097c;

    /* JADX INFO: renamed from: d */
    public ImageView f35098d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f35099e;

    /* JADX INFO: renamed from: f */
    public View f35100f;

    /* JADX INFO: renamed from: g */
    public VText f35101g;

    /* JADX INFO: renamed from: h */
    public ImageView f35102h;

    /* JADX INFO: renamed from: i */
    public VText f35103i;

    /* JADX INFO: renamed from: j */
    public VImage f35104j;

    /* JADX INFO: renamed from: k */
    public ArrayList<View> f35105k;

    /* JADX INFO: renamed from: l */
    public View f35106l;

    public UserTagsView(Context context) {
        super(context);
        this.f35105k = new ArrayList<>();
    }

    /* JADX INFO: renamed from: a */
    public final void m54228a(View view) {
        ijk0.m140210a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m54229b() {
        if (this.f35106l != null) {
            return;
        }
        View viewM112692a = cum.m112692a(getContext(), kec0.f125833fb, null);
        this.f35106l = viewM112692a;
        m54228a(viewM112692a);
        addView(this.f35106l);
        this.f35105k.add(this.f35099e);
        this.f35105k.add(this.f35095a);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54229b();
        setLayerType(1, null);
    }

    public UserTagsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35105k = new ArrayList<>();
    }

    public UserTagsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35105k = new ArrayList<>();
    }
}
