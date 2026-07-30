package com.p000p1.mobile.putong.core.p001ui.marry.profile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.a5c0;
import l.k9c0;
import l.n6c0;
import l.qib0;
import l.vwb;
import l.xdl0;
import p003l.dac0;
import p003l.eqh0;
import p003l.wvl;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryEditProfileItemImagesView extends ConstraintLayout implements wvl {

    /* JADX INFO: renamed from: d */
    public VText f323d;

    /* JADX INFO: renamed from: e */
    public VText f324e;

    /* JADX INFO: renamed from: f */
    public VImage f325f;

    /* JADX INFO: renamed from: g */
    public VImage f326g;

    /* JADX INFO: renamed from: h */
    public VImage f327h;

    /* JADX INFO: renamed from: i */
    public RecyclerView f328i;

    /* JADX INFO: renamed from: j */
    public C0035a f329j;

    /* JADX INFO: renamed from: k */
    public MarrySeriesType f330k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.view.MarryEditProfileItemImagesView$a */
    public class C0035a extends dac0<String> {

        /* JADX INFO: renamed from: c */
        public List<String> f331c;

        public C0035a() {
            this.f331c = new ArrayList();
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: C */
        public int mo203C() {
            return this.f331c.size();
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: D */
        public View mo204D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(MarryEditProfileItemImagesView.this.getContext()).inflate(n6c0.R, viewGroup, false);
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo202A(View view, String str, int i, int i2) {
            qib0.G.L0(view.findViewById(a5c0.v), str);
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return this.f331c.get(i);
        }

        /* JADX INFO: renamed from: G */
        public void m598G(@NonNull List<String> list) {
            this.f331c = list;
            notifyDataSetChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarryEditProfileItemImagesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k9c0.t);
        CharSequence string = typedArrayObtainStyledAttributes.getString(k9c0.u);
        CharSequence string2 = typedArrayObtainStyledAttributes.getString(k9c0.w);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(n6c0.S, (ViewGroup) this, true);
        this.f323d = (VText) findViewById(a5c0.Y);
        this.f324e = (VText) findViewById(a5c0.C);
        this.f325f = (VImage) findViewById(a5c0.K);
        this.f326g = (VImage) findViewById(a5c0.n);
        this.f327h = (VImage) findViewById(a5c0.L);
        this.f328i = findViewById(a5c0.D);
        this.f323d.setText(string);
        this.f324e.setText(string2);
        C0035a c0035a = new C0035a();
        this.f329j = c0035a;
        this.f328i.setAdapter(c0035a);
        this.f323d.setTypeface(eqh0.m3924c(3), 1);
        this.f324e.setTypeface(eqh0.m3924c(3), 1);
    }

    private void setContentList(List<String> list) {
        boolean zJ = vwb.J(list);
        AppCompatTextView appCompatTextView = this.f324e;
        if (zJ) {
            xdl0.M(appCompatTextView, true);
            xdl0.M(this.f327h, true);
            xdl0.M(this.f326g, false);
            xdl0.M(this.f328i, false);
            xdl0.M(this.f325f, this.f330k.isRequired());
            return;
        }
        xdl0.M(appCompatTextView, false);
        xdl0.M(this.f327h, false);
        xdl0.M(this.f326g, true);
        xdl0.M(this.f328i, true);
        xdl0.M(this.f325f, false);
        this.f329j.m598G(list);
    }

    @Override // p003l.wvl
    /* JADX INFO: renamed from: d */
    public void mo575d(User user) {
        super.mo575d(user);
        List<String> arrayList = new ArrayList<>();
        if (NullChecker.a(user.profile) && NullChecker.a(user.profile.extensions) && NullChecker.a(user.profile.extensions.marriage)) {
            arrayList = user.profile.extensions.marriage.lifeMoment;
        }
        setContentList(arrayList);
    }

    @Override // p003l.wvl
    /* JADX INFO: renamed from: d0 */
    public boolean mo594d0() {
        return !xdl0.O0(this.f325f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003l.wvl
    public View getClickView() {
        return this;
    }

    @Override // p003l.wvl
    public MarrySeriesType getItemType() {
        return this.f330k;
    }

    /* JADX INFO: renamed from: h0 */
    public wvl m595h0(MarrySeriesType marrySeriesType) {
        this.f330k = marrySeriesType;
        return this;
    }

    @Override // p003l.wvl
    public /* bridge */ /* synthetic */ void setContent(String str) {
        super.setContent(str);
    }

    public MarryEditProfileItemImagesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MarryEditProfileItemImagesView(Context context) {
        this(context, null);
    }
}
