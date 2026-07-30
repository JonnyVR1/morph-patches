package com.p046p1.mobile.putong.core.p053ui.marry.profile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowView;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import p147v.VImage;
import p147v.VText;
import p149l.a5c0;
import p149l.eqh0;
import p149l.k9c0;
import p149l.m2x;
import p149l.n6c0;
import p149l.t100;
import p149l.vwb;
import p149l.wvl;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileItemTagsView extends ConstraintLayout implements wvl {

    /* JADX INFO: renamed from: d */
    public VText f30442d;

    /* JADX INFO: renamed from: e */
    public VText f30443e;

    /* JADX INFO: renamed from: f */
    public VImage f30444f;

    /* JADX INFO: renamed from: g */
    public VImage f30445g;

    /* JADX INFO: renamed from: h */
    public VImage f30446h;

    /* JADX INFO: renamed from: i */
    public FlowView f30447i;

    /* JADX INFO: renamed from: j */
    public String f30448j;

    /* JADX INFO: renamed from: k */
    public MarrySeriesType f30449k;

    /* JADX INFO: renamed from: l */
    public boolean f30450l;

    public MarryEditProfileItemTagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30450l = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k9c0.f121984q);
        String string = typedArrayObtainStyledAttributes.getString(k9c0.f121986s);
        this.f30448j = typedArrayObtainStyledAttributes.getString(k9c0.f121985r);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(n6c0.f137327V, (ViewGroup) this, true);
        this.f30442d = (VText) findViewById(a5c0.f67671Y);
        this.f30443e = (VText) findViewById(a5c0.f67649C);
        this.f30444f = (VImage) findViewById(a5c0.f67657K);
        this.f30445g = (VImage) findViewById(a5c0.f67691n);
        this.f30446h = (VImage) findViewById(a5c0.f67658L);
        this.f30447i = (FlowView) findViewById(a5c0.f67667U);
        this.f30442d.setText(string);
        this.f30443e.setText(this.f30448j);
        this.f30442d.setTypeface(eqh0.m117752c(3), 1);
        this.f30443e.setTypeface(eqh0.m117752c(3), 1);
    }

    @Override // p149l.wvl
    /* JADX INFO: renamed from: d */
    public void mo47525d(User user) {
        if (user == null) {
            m47549j0();
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(m2x.m152721c(MarrySeriesType.MATE_STATUS, user));
        arrayList.add(m2x.m152721c(MarrySeriesType.MATE_AGE_EDIT, user));
        arrayList.add(m2x.m152721c(MarrySeriesType.MATE_QUALIFICATIONS, user));
        arrayList.add(m2x.m152721c(MarrySeriesType.MATE_HEIGHT, user));
        arrayList.add(m2x.m152721c(MarrySeriesType.MATE_INCOME, user));
        arrayList.add(m2x.m152721c(MarrySeriesType.MATE_ADDRESS, user));
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            if (!TextUtils.equals(str, "不限") && !TextUtils.isEmpty(str)) {
                arrayList2.add(m47548i0(str));
            }
        }
        String str2 = vwb.m200296J(user.profile.extensions.marriage.mateDescription) ? "" : user.profile.extensions.marriage.mateDescription.get(0);
        if (vwb.m200296J(arrayList2) && TextUtils.isEmpty(str2)) {
            m47549j0();
            return;
        }
        this.f30443e.setText(str2);
        this.f30447i.setTags(arrayList2);
        xdl0.m208344M(this.f30445g, true);
        xdl0.m208344M(this.f30444f, false);
        this.f30450l = true;
        xdl0.m208344M(this.f30446h, false);
        xdl0.m208344M(this.f30447i, true);
        if (vwb.m200296J(arrayList2)) {
            xdl0.m208360X(this.f30443e, t100.m186890d(23.0f));
            xdl0.m208344M(this.f30443e, true);
            xdl0.m208344M(this.f30447i, false);
        } else if (TextUtils.isEmpty(str2)) {
            xdl0.m208360X(this.f30447i, t100.m186890d(21.0f));
            xdl0.m208344M(this.f30443e, false);
            xdl0.m208344M(this.f30447i, true);
        } else {
            xdl0.m208360X(this.f30443e, t100.m186890d(12.0f));
            xdl0.m208360X(this.f30447i, t100.m186890d(21.0f));
            xdl0.m208344M(this.f30443e, true);
            xdl0.m208344M(this.f30447i, true);
        }
    }

    @Override // p149l.wvl
    /* JADX INFO: renamed from: d0 */
    public boolean mo47542d0() {
        return this.f30450l;
    }

    @Override // p149l.wvl
    public View getClickView() {
        return this;
    }

    @Override // p149l.wvl
    public MarrySeriesType getItemType() {
        return this.f30449k;
    }

    /* JADX INFO: renamed from: h0 */
    public wvl m47547h0(MarrySeriesType marrySeriesType) {
        this.f30449k = marrySeriesType;
        return this;
    }

    /* JADX INFO: renamed from: i0 */
    public final View m47548i0(String str) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(n6c0.f137325U, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(a5c0.f67684g);
        vText.setText(str);
        vText.setTypeface(eqh0.m117752c(3), 1);
        return viewInflate;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m47549j0() {
        xdl0.m208360X(this.f30443e, t100.m186890d(23.0f));
        this.f30443e.setText(this.f30448j);
        xdl0.m208344M(this.f30445g, false);
        xdl0.m208344M(this.f30444f, this.f30449k.isRequired());
        xdl0.m208344M(this.f30446h, true);
        xdl0.m208344M(this.f30447i, false);
        xdl0.m208344M(this.f30443e, true);
        this.f30450l = !this.f30449k.isRequired();
    }

    @Override // p149l.wvl
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
