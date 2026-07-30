package com.p046p1.mobile.putong.core.p053ui.marry.profile.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VText;
import p149l.a5c0;
import p149l.dac0;
import p149l.eqh0;
import p149l.k9c0;
import p149l.n6c0;
import p149l.qib0;
import p149l.vwb;
import p149l.wvl;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileItemImagesView extends ConstraintLayout implements wvl {

    /* JADX INFO: renamed from: d */
    public VText f30432d;

    /* JADX INFO: renamed from: e */
    public VText f30433e;

    /* JADX INFO: renamed from: f */
    public VImage f30434f;

    /* JADX INFO: renamed from: g */
    public VImage f30435g;

    /* JADX INFO: renamed from: h */
    public VImage f30436h;

    /* JADX INFO: renamed from: i */
    public RecyclerView f30437i;

    /* JADX INFO: renamed from: j */
    public C8452a f30438j;

    /* JADX INFO: renamed from: k */
    public MarrySeriesType f30439k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.view.MarryEditProfileItemImagesView$a */
    public class C8452a extends dac0<String> {

        /* JADX INFO: renamed from: c */
        public List<String> f30440c;

        public C8452a() {
            this.f30440c = new ArrayList();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f30440c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(MarryEditProfileItemImagesView.this.getContext()).inflate(n6c0.f137319R, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, String str, int i, int i2) {
            qib0.f154691G.m102331L0((SimpleDraweeView) view.findViewById(a5c0.f67699v), str);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return this.f30440c.get(i);
        }

        /* JADX INFO: renamed from: G */
        public void m47546G(@NonNull List<String> list) {
            this.f30440c = list;
            notifyDataSetChanged();
        }
    }

    public MarryEditProfileItemImagesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k9c0.f121987t);
        String string = typedArrayObtainStyledAttributes.getString(k9c0.f121988u);
        String string2 = typedArrayObtainStyledAttributes.getString(k9c0.f121990w);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(n6c0.f137321S, (ViewGroup) this, true);
        this.f30432d = (VText) findViewById(a5c0.f67671Y);
        this.f30433e = (VText) findViewById(a5c0.f67649C);
        this.f30434f = (VImage) findViewById(a5c0.f67657K);
        this.f30435g = (VImage) findViewById(a5c0.f67691n);
        this.f30436h = (VImage) findViewById(a5c0.f67658L);
        this.f30437i = (RecyclerView) findViewById(a5c0.f67650D);
        this.f30432d.setText(string);
        this.f30433e.setText(string2);
        C8452a c8452a = new C8452a();
        this.f30438j = c8452a;
        this.f30437i.setAdapter(c8452a);
        this.f30432d.setTypeface(eqh0.m117752c(3), 1);
        this.f30433e.setTypeface(eqh0.m117752c(3), 1);
    }

    private void setContentList(List<String> list) {
        boolean zM200296J = vwb.m200296J(list);
        VText vText = this.f30433e;
        if (zM200296J) {
            xdl0.m208344M(vText, true);
            xdl0.m208344M(this.f30436h, true);
            xdl0.m208344M(this.f30435g, false);
            xdl0.m208344M(this.f30437i, false);
            xdl0.m208344M(this.f30434f, this.f30439k.isRequired());
            return;
        }
        xdl0.m208344M(vText, false);
        xdl0.m208344M(this.f30436h, false);
        xdl0.m208344M(this.f30435g, true);
        xdl0.m208344M(this.f30437i, true);
        xdl0.m208344M(this.f30434f, false);
        this.f30438j.m47546G(list);
    }

    @Override // p149l.wvl
    /* JADX INFO: renamed from: d */
    public void mo47525d(User user) {
        super.mo47525d(user);
        List<String> arrayList = new ArrayList<>();
        if (NullChecker.m81303a(user.profile) && NullChecker.m81303a(user.profile.extensions) && NullChecker.m81303a(user.profile.extensions.marriage)) {
            arrayList = user.profile.extensions.marriage.lifeMoment;
        }
        setContentList(arrayList);
    }

    @Override // p149l.wvl
    /* JADX INFO: renamed from: d0 */
    public boolean mo47542d0() {
        return !xdl0.m208349O0(this.f30434f);
    }

    @Override // p149l.wvl
    public View getClickView() {
        return this;
    }

    @Override // p149l.wvl
    public MarrySeriesType getItemType() {
        return this.f30439k;
    }

    /* JADX INFO: renamed from: h0 */
    public wvl m47543h0(MarrySeriesType marrySeriesType) {
        this.f30439k = marrySeriesType;
        return this;
    }

    @Override // p149l.wvl
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
