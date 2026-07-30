package com.p051p1.mobile.putong.core.newui.poi.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.UserTagData;
import com.p051p1.mobile.putong.core.data.UserTagsData;
import com.p051p1.mobile.putong.core.newui.poi.FeedPoiTraceFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.gj40;
import p153l.ji80;
import p153l.jyb;
import p153l.kec0;
import p153l.oph;

/* JADX INFO: loaded from: classes11.dex */
public class FeedPoiCardItemMyTagsView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedPoiCardItemMyTagsView f27141a;

    /* JADX INFO: renamed from: b */
    public VText f27142b;

    /* JADX INFO: renamed from: c */
    public VText f27143c;

    /* JADX INFO: renamed from: d */
    public FlowTagsView f27144d;

    public FeedPoiCardItemMyTagsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m44169e(View view) {
        oph.m168674a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final View m44170f(UserTagsData userTagsData, final UserTagData userTagData) {
        View viewInflate = ((PutongAct) getContext()).inflater().inflate(kec0.f125523Ma, (ViewGroup) null);
        final VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70031N5);
        VText vText = (VText) viewInflate.findViewById(adc0.f70409je);
        VText vText2 = (VText) viewInflate.findViewById(adc0.f70273bd);
        if (!TextUtils.isEmpty(userTagData.icon)) {
            vDraweeView.post(new Runnable() { // from class: l.mph
                @Override // java.lang.Runnable
                public final void run() {
                    uqb0.f180374G.m127115L0(vDraweeView, userTagData.icon);
                }
            });
        }
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        vText.setText(userTagData.title);
        if (TextUtils.isEmpty(userTagData.subtitle)) {
            bnl0.m105524M(vText2, false);
        } else {
            vText2.setText(userTagData.subtitle);
            bnl0.m105524M(vText2, true);
        }
        if (userTagData.highlighted) {
            bnl0.m105501A0(getContext(), viewInflate, dbc0.f86000An);
            return viewInflate;
        }
        bnl0.m105501A0(getContext(), viewInflate, dbc0.f87649zn);
        return viewInflate;
    }

    /* JADX INFO: renamed from: g */
    public List<View> m44171g(UserTagsData userTagsData) {
        if (!NullChecker.m82486a(userTagsData)) {
            return null;
        }
        List<UserTagData> list = userTagsData.tags;
        ArrayList arrayList = new ArrayList();
        for (UserTagData userTagData : list) {
            if (NullChecker.m82486a(userTagData)) {
                arrayList.add(m44170f(userTagsData, userTagData));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final void m44172h(UserTagsData userTagsData, int i) {
        bnl0.m105524M(this.f27143c, false);
        this.f27144d.setMaxLines(i);
        this.f27144d.setCallBack(new FlowTagsView.InterfaceC8905a() { // from class: l.lph
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView.InterfaceC8905a
            /* JADX INFO: renamed from: a */
            public final void mo54097a() {
                this.f133064a.m44174j();
            }
        });
        this.f27144d.f34968f = false;
        List<View> listM44171g = m44171g(userTagsData);
        this.f27144d.setTags(listM44171g);
        bnl0.m105524M(this.f27141a, !jyb.m147479J(listM44171g));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m44173i() {
        bnl0.m105524M(this.f27143c, true);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m44174j() {
        if (bnl0.m105529O0(this.f27143c)) {
            return;
        }
        this.f27143c.post(new Runnable() { // from class: l.nph
            @Override // java.lang.Runnable
            public final void run() {
                this.f143101a.m44173i();
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m44175k(final FeedPoiTraceFrag feedPoiTraceFrag, final ji80 ji80Var) {
        m44172h(gj40.m130415o().m130416A((PutongAct) getContext(), ji80Var.f121050b, false), 3);
        bnl0.m105509E0(this.f27143c, new View.OnClickListener() { // from class: l.kph
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gj40.m130415o().m130422G(feedPoiTraceFrag, 3001, ji80Var.f121050b, false);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44169e(this);
        VText vText = this.f27142b;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f27143c.setTypeface(typeface);
    }

    public FeedPoiCardItemMyTagsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPoiCardItemMyTagsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
