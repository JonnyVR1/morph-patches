package com.p051p1.mobile.putong.core.p058ui.marry.profile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowView;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.gdc0;
import p153l.jyb;
import p153l.l5x;
import p153l.lyh0;
import p153l.oyl;
import p153l.qa00;
import p153l.rhc0;
import p153l.sec0;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileItemTagsView extends ConstraintLayout implements oyl {

    /* JADX INFO: renamed from: d */
    public VText f31290d;

    /* JADX INFO: renamed from: e */
    public VText f31291e;

    /* JADX INFO: renamed from: f */
    public VImage f31292f;

    /* JADX INFO: renamed from: g */
    public VImage f31293g;

    /* JADX INFO: renamed from: h */
    public VImage f31294h;

    /* JADX INFO: renamed from: i */
    public FlowView f31295i;

    /* JADX INFO: renamed from: j */
    public String f31296j;

    /* JADX INFO: renamed from: k */
    public MarrySeriesType f31297k;

    /* JADX INFO: renamed from: l */
    public boolean f31298l;

    public MarryEditProfileItemTagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31298l = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rhc0.f163145q);
        String string = typedArrayObtainStyledAttributes.getString(rhc0.f163147s);
        this.f31296j = typedArrayObtainStyledAttributes.getString(rhc0.f163146r);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(sec0.f167541V, (ViewGroup) this, true);
        this.f31290d = (VText) findViewById(gdc0.f103666Y);
        this.f31291e = (VText) findViewById(gdc0.f103644C);
        this.f31292f = (VImage) findViewById(gdc0.f103652K);
        this.f31293g = (VImage) findViewById(gdc0.f103686n);
        this.f31294h = (VImage) findViewById(gdc0.f103653L);
        this.f31295i = (FlowView) findViewById(gdc0.f103662U);
        this.f31290d.setText(string);
        this.f31291e.setText(this.f31296j);
        this.f31290d.setTypeface(lyh0.m156283c(3), 1);
        this.f31291e.setTypeface(lyh0.m156283c(3), 1);
    }

    @Override // p153l.oyl
    /* JADX INFO: renamed from: d */
    public void mo48708d(User user) {
        if (user == null) {
            m48732j0();
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(l5x.m153006c(MarrySeriesType.MATE_STATUS, user));
        arrayList.add(l5x.m153006c(MarrySeriesType.MATE_AGE_EDIT, user));
        arrayList.add(l5x.m153006c(MarrySeriesType.MATE_QUALIFICATIONS, user));
        arrayList.add(l5x.m153006c(MarrySeriesType.MATE_HEIGHT, user));
        arrayList.add(l5x.m153006c(MarrySeriesType.MATE_INCOME, user));
        arrayList.add(l5x.m153006c(MarrySeriesType.MATE_ADDRESS, user));
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            if (!TextUtils.equals(str, "不限") && !TextUtils.isEmpty(str)) {
                arrayList2.add(m48731i0(str));
            }
        }
        String str2 = jyb.m147479J(user.profile.extensions.marriage.mateDescription) ? "" : user.profile.extensions.marriage.mateDescription.get(0);
        if (jyb.m147479J(arrayList2) && TextUtils.isEmpty(str2)) {
            m48732j0();
            return;
        }
        this.f31291e.setText(str2);
        this.f31295i.setTags(arrayList2);
        bnl0.m105524M(this.f31293g, true);
        bnl0.m105524M(this.f31292f, false);
        this.f31298l = true;
        bnl0.m105524M(this.f31294h, false);
        bnl0.m105524M(this.f31295i, true);
        if (jyb.m147479J(arrayList2)) {
            bnl0.m105540X(this.f31291e, qa00.m175859d(23.0f));
            bnl0.m105524M(this.f31291e, true);
            bnl0.m105524M(this.f31295i, false);
        } else if (TextUtils.isEmpty(str2)) {
            bnl0.m105540X(this.f31295i, qa00.m175859d(21.0f));
            bnl0.m105524M(this.f31291e, false);
            bnl0.m105524M(this.f31295i, true);
        } else {
            bnl0.m105540X(this.f31291e, qa00.m175859d(12.0f));
            bnl0.m105540X(this.f31295i, qa00.m175859d(21.0f));
            bnl0.m105524M(this.f31291e, true);
            bnl0.m105524M(this.f31295i, true);
        }
    }

    @Override // p153l.oyl
    /* JADX INFO: renamed from: d0 */
    public boolean mo48725d0() {
        return this.f31298l;
    }

    @Override // p153l.oyl
    public View getClickView() {
        return this;
    }

    @Override // p153l.oyl
    public MarrySeriesType getItemType() {
        return this.f31297k;
    }

    /* JADX INFO: renamed from: h0 */
    public oyl m48730h0(MarrySeriesType marrySeriesType) {
        this.f31297k = marrySeriesType;
        return this;
    }

    /* JADX INFO: renamed from: i0 */
    public final View m48731i0(String str) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(sec0.f167539U, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(gdc0.f103679g);
        vText.setText(str);
        vText.setTypeface(lyh0.m156283c(3), 1);
        return viewInflate;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m48732j0() {
        bnl0.m105540X(this.f31291e, qa00.m175859d(23.0f));
        this.f31291e.setText(this.f31296j);
        bnl0.m105524M(this.f31293g, false);
        bnl0.m105524M(this.f31292f, this.f31297k.isRequired());
        bnl0.m105524M(this.f31294h, true);
        bnl0.m105524M(this.f31295i, false);
        bnl0.m105524M(this.f31291e, true);
        this.f31298l = !this.f31297k.isRequired();
    }

    @Override // p153l.oyl
    public /* bridge */ /* synthetic */ void setContent(String str) {
        super.setContent(str);
    }

    public MarryEditProfileItemTagsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MarryEditProfileItemTagsView(Context context) {
        this(context, null);
    }
}
