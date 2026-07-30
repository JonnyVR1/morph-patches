package com.p000p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.poi.FeedPoiTraceFrag;
import com.p1.mobile.putong.core.data.UserTagData;
import com.p1.mobile.putong.core.data.UserTagsData;
import com.p1.mobile.putong.core.ui.profile.views.FlowTagsView;
import com.p1.mobile.putong.core.ui.profile.views.FlowView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.f6c0;
import l.qib0;
import l.sa40;
import l.u4c0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.znh;
import p009l.da80;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FeedPoiCardItemMyTagsView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedPoiCardItemMyTagsView f5177a;

    /* JADX INFO: renamed from: b */
    public VText f5178b;

    /* JADX INFO: renamed from: c */
    public VText f5179c;

    /* JADX INFO: renamed from: d */
    public FlowTagsView f5180d;

    public FeedPoiCardItemMyTagsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m7373e(View view) {
        znh.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final View m7374f(UserTagsData userTagsData, final UserTagData userTagData) {
        View viewInflate = getContext().inflater().inflate(f6c0.Fa, (ViewGroup) null);
        final VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(u4c0.L5);
        viewInflate.findViewById(u4c0.o8);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.ge);
        VText vTextFindViewById2 = viewInflate.findViewById(u4c0.Zc);
        if (!TextUtils.isEmpty(userTagData.icon)) {
            vDraweeViewFindViewById.post(new Runnable() { // from class: l.xnh
                @Override // java.lang.Runnable
                public final void run() {
                    qib0.G.L0(vDraweeViewFindViewById, userTagData.icon);
                }
            });
        }
        vTextFindViewById.setTypeface(Typeface.DEFAULT_BOLD);
        vTextFindViewById.setText(userTagData.title);
        if (TextUtils.isEmpty(userTagData.subtitle)) {
            xdl0.M(vTextFindViewById2, false);
        } else {
            vTextFindViewById2.setText(userTagData.subtitle);
            xdl0.M(vTextFindViewById2, true);
        }
        if (userTagData.highlighted) {
            xdl0.A0(getContext(), viewInflate, x2c0.Mm);
            return viewInflate;
        }
        xdl0.A0(getContext(), viewInflate, x2c0.Lm);
        return viewInflate;
    }

    /* JADX INFO: renamed from: g */
    public List<View> m7375g(UserTagsData userTagsData) {
        if (!NullChecker.a(userTagsData)) {
            return null;
        }
        List<UserTagData> list = userTagsData.tags;
        ArrayList arrayList = new ArrayList();
        for (UserTagData userTagData : list) {
            if (NullChecker.a(userTagData)) {
                arrayList.add(m7374f(userTagsData, userTagData));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final void m7376h(UserTagsData userTagsData, int i) {
        xdl0.M(this.f5179c, false);
        this.f5180d.setMaxLines(i);
        this.f5180d.setCallBack(new FlowTagsView.a() { // from class: l.wnh
            /* JADX INFO: renamed from: a */
            public final void m24414a() {
                this.f22223a.m7378j();
            }
        });
        ((FlowView) this.f5180d).f = false;
        List<View> listM7375g = m7375g(userTagsData);
        this.f5180d.setTags(listM7375g);
        xdl0.M(this.f5177a, !vwb.J(listM7375g));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m7377i() {
        xdl0.M(this.f5179c, true);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m7378j() {
        if (xdl0.O0(this.f5179c)) {
            return;
        }
        this.f5179c.post(new Runnable() { // from class: l.ynh
            @Override // java.lang.Runnable
            public final void run() {
                this.f23156a.m7377i();
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m7379k(final FeedPoiTraceFrag feedPoiTraceFrag, final da80 da80Var) {
        m7376h(sa40.o().A(getContext(), da80Var.f11695b, false), 3);
        xdl0.E0(this.f5179c, new View.OnClickListener() { // from class: l.vnh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sa40.o().G(feedPoiTraceFrag, 3001, da80Var.f11695b, false);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7373e(this);
        VText vText = this.f5178b;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f5179c.setTypeface(typeface);
    }

    public FeedPoiCardItemMyTagsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiCardItemMyTagsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
