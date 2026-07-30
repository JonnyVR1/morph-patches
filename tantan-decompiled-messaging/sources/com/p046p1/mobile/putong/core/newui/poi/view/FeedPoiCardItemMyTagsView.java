package com.p046p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.UserTagData;
import com.p046p1.mobile.putong.core.data.UserTagsData;
import com.p046p1.mobile.putong.core.newui.poi.FeedPoiTraceFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.da80;
import p149l.f6c0;
import p149l.sa40;
import p149l.u4c0;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.znh;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardItemMyTagsView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedPoiCardItemMyTagsView f26399a;

    /* JADX INFO: renamed from: b */
    public VText f26400b;

    /* JADX INFO: renamed from: c */
    public VText f26401c;

    /* JADX INFO: renamed from: d */
    public FlowTagsView f26402d;

    public FeedPoiCardItemMyTagsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m43158e(View view) {
        znh.m219448a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final View m43159f(UserTagsData userTagsData, final UserTagData userTagData) {
        View viewInflate = ((PutongAct) getContext()).inflater().inflate(f6c0.f95357Fa, (ViewGroup) null);
        final VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f173909L5);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174268ge);
        VText vText2 = (VText) viewInflate.findViewById(u4c0.f174148Zc);
        if (!TextUtils.isEmpty(userTagData.icon)) {
            vDraweeView.post(new Runnable() { // from class: l.xnh
                @Override // java.lang.Runnable
                public final void run() {
                    qib0.f154691G.m102331L0(vDraweeView, userTagData.icon);
                }
            });
        }
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        vText.setText(userTagData.title);
        if (TextUtils.isEmpty(userTagData.subtitle)) {
            xdl0.m208344M(vText2, false);
        } else {
            vText2.setText(userTagData.subtitle);
            xdl0.m208344M(vText2, true);
        }
        if (userTagData.highlighted) {
            xdl0.m208321A0(getContext(), viewInflate, x2c0.f189554Mm);
            return viewInflate;
        }
        xdl0.m208321A0(getContext(), viewInflate, x2c0.f189523Lm);
        return viewInflate;
    }

    /* JADX INFO: renamed from: g */
    public List<View> m43160g(UserTagsData userTagsData) {
        if (!NullChecker.m81303a(userTagsData)) {
            return null;
        }
        List<UserTagData> list = userTagsData.tags;
        ArrayList arrayList = new ArrayList();
        for (UserTagData userTagData : list) {
            if (NullChecker.m81303a(userTagData)) {
                arrayList.add(m43159f(userTagsData, userTagData));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final void m43161h(UserTagsData userTagsData, int i) {
        xdl0.m208344M(this.f26401c, false);
        this.f26402d.setMaxLines(i);
        this.f26402d.setCallBack(new FlowTagsView.InterfaceC8742a() { // from class: l.wnh
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView.InterfaceC8742a
            /* JADX INFO: renamed from: a */
            public final void mo52914a() {
                this.f187308a.m43163j();
            }
        });
        this.f26402d.f34120f = false;
        List<View> listM43160g = m43160g(userTagsData);
        this.f26402d.setTags(listM43160g);
        xdl0.m208344M(this.f26399a, !vwb.m200296J(listM43160g));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m43162i() {
        xdl0.m208344M(this.f26401c, true);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m43163j() {
        if (xdl0.m208349O0(this.f26401c)) {
            return;
        }
        this.f26401c.post(new Runnable() { // from class: l.ynh
            @Override // java.lang.Runnable
            public final void run() {
                this.f199157a.m43162i();
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m43164k(final FeedPoiTraceFrag feedPoiTraceFrag, final da80 da80Var) {
        m43161h(sa40.m182802o().m182803A((PutongAct) getContext(), da80Var.f85198b, false), 3);
        xdl0.m208329E0(this.f26401c, new View.OnClickListener() { // from class: l.vnh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sa40.m182802o().m182809G(feedPoiTraceFrag, 3001, da80Var.f85198b, false);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43158e(this);
        VText vText = this.f26400b;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f26401c.setTypeface(typeface);
    }

    public FeedPoiCardItemMyTagsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiCardItemMyTagsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
