package com.p000p1.mobile.putong.core.p001ui.marry.profile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.core.ui.profile.views.FlowView;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import l.a5c0;
import l.k9c0;
import l.n6c0;
import l.t100;
import l.vwb;
import l.xdl0;
import p003l.eqh0;
import p003l.m2x;
import p003l.wvl;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryEditProfileItemTagsView extends ConstraintLayout implements wvl {

    /* JADX INFO: renamed from: d */
    public VText f333d;

    /* JADX INFO: renamed from: e */
    public VText f334e;

    /* JADX INFO: renamed from: f */
    public VImage f335f;

    /* JADX INFO: renamed from: g */
    public VImage f336g;

    /* JADX INFO: renamed from: h */
    public VImage f337h;

    /* JADX INFO: renamed from: i */
    public FlowView f338i;

    /* JADX INFO: renamed from: j */
    public String f339j;

    /* JADX INFO: renamed from: k */
    public MarrySeriesType f340k;

    /* JADX INFO: renamed from: l */
    public boolean f341l;

    /* JADX WARN: Multi-variable type inference failed */
    public MarryEditProfileItemTagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f341l = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k9c0.q);
        CharSequence string = typedArrayObtainStyledAttributes.getString(k9c0.s);
        this.f339j = typedArrayObtainStyledAttributes.getString(k9c0.r);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(n6c0.V, (ViewGroup) this, true);
        this.f333d = (VText) findViewById(a5c0.Y);
        this.f334e = (VText) findViewById(a5c0.C);
        this.f335f = (VImage) findViewById(a5c0.K);
        this.f336g = (VImage) findViewById(a5c0.n);
        this.f337h = (VImage) findViewById(a5c0.L);
        this.f338i = findViewById(a5c0.U);
        this.f333d.setText(string);
        this.f334e.setText(this.f339j);
        this.f333d.setTypeface(eqh0.m3924c(3), 1);
        this.f334e.setTypeface(eqh0.m3924c(3), 1);
    }

    @Override // p003l.wvl
    /* JADX INFO: renamed from: d */
    public void mo575d(User user) {
        if (user == null) {
            m601j0();
            return;
        }
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add(m2x.m6196c(MarrySeriesType.MATE_STATUS, user));
        arrayList.add(m2x.m6196c(MarrySeriesType.MATE_AGE_EDIT, user));
        arrayList.add(m2x.m6196c(MarrySeriesType.MATE_QUALIFICATIONS, user));
        arrayList.add(m2x.m6196c(MarrySeriesType.MATE_HEIGHT, user));
        arrayList.add(m2x.m6196c(MarrySeriesType.MATE_INCOME, user));
        arrayList.add(m2x.m6196c(MarrySeriesType.MATE_ADDRESS, user));
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            if (!TextUtils.equals(str, "不限") && !TextUtils.isEmpty(str)) {
                arrayList2.add(m600i0(str));
            }
        }
        CharSequence charSequence = vwb.J(user.profile.extensions.marriage.mateDescription) ? "" : (String) user.profile.extensions.marriage.mateDescription.get(0);
        if (vwb.J(arrayList2) && TextUtils.isEmpty(charSequence)) {
            m601j0();
            return;
        }
        this.f334e.setText(charSequence);
        this.f338i.setTags(arrayList2);
        xdl0.M(this.f336g, true);
        xdl0.M(this.f335f, false);
        this.f341l = true;
        xdl0.M(this.f337h, false);
        xdl0.M(this.f338i, true);
        if (vwb.J(arrayList2)) {
            xdl0.X(this.f334e, t100.d(23.0f));
            xdl0.M(this.f334e, true);
            xdl0.M(this.f338i, false);
        } else if (TextUtils.isEmpty(charSequence)) {
            xdl0.X(this.f338i, t100.d(21.0f));
            xdl0.M(this.f334e, false);
            xdl0.M(this.f338i, true);
        } else {
            xdl0.X(this.f334e, t100.d(12.0f));
            xdl0.X(this.f338i, t100.d(21.0f));
            xdl0.M(this.f334e, true);
            xdl0.M(this.f338i, true);
        }
    }

    @Override // p003l.wvl
    /* JADX INFO: renamed from: d0 */
    public boolean mo594d0() {
        return this.f341l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003l.wvl
    public View getClickView() {
        return this;
    }

    @Override // p003l.wvl
    public MarrySeriesType getItemType() {
        return this.f340k;
    }

    /* JADX INFO: renamed from: h0 */
    public wvl m599h0(MarrySeriesType marrySeriesType) {
        this.f340k = marrySeriesType;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public final View m600i0(String str) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(n6c0.U, (ViewGroup) null);
        AppCompatTextView appCompatTextView = (VText) viewInflate.findViewById(a5c0.g);
        appCompatTextView.setText(str);
        appCompatTextView.setTypeface(eqh0.m3924c(3), 1);
        return viewInflate;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m601j0() {
        xdl0.X(this.f334e, t100.d(23.0f));
        this.f334e.setText(this.f339j);
        xdl0.M(this.f336g, false);
        xdl0.M(this.f335f, this.f340k.isRequired());
        xdl0.M(this.f337h, true);
        xdl0.M(this.f338i, false);
        xdl0.M(this.f334e, true);
        this.f341l = !this.f340k.isRequired();
    }

    @Override // p003l.wvl
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
