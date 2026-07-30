package com.p051p1.mobile.putong.core.p058ui.marry.profile.view;

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
import com.p051p1.mobile.putong.core.p058ui.marry.profile.loop.bean.MarrySeriesType;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.gdc0;
import p153l.jic0;
import p153l.jyb;
import p153l.lyh0;
import p153l.oyl;
import p153l.rhc0;
import p153l.sec0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class MarryEditProfileItemImagesView extends ConstraintLayout implements oyl {

    /* JADX INFO: renamed from: d */
    public VText f31280d;

    /* JADX INFO: renamed from: e */
    public VText f31281e;

    /* JADX INFO: renamed from: f */
    public VImage f31282f;

    /* JADX INFO: renamed from: g */
    public VImage f31283g;

    /* JADX INFO: renamed from: h */
    public VImage f31284h;

    /* JADX INFO: renamed from: i */
    public RecyclerView f31285i;

    /* JADX INFO: renamed from: j */
    public C8615a f31286j;

    /* JADX INFO: renamed from: k */
    public MarrySeriesType f31287k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.marry.profile.view.MarryEditProfileItemImagesView$a */
    public class C8615a extends jic0<String> {

        /* JADX INFO: renamed from: c */
        public List<String> f31288c;

        public C8615a() {
            this.f31288c = new ArrayList();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f31288c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(MarryEditProfileItemImagesView.this.getContext()).inflate(sec0.f167533R, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, String str, int i, int i2) {
            uqb0.f180374G.m127115L0((SimpleDraweeView) view.findViewById(gdc0.f103694v), str);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return this.f31288c.get(i);
        }

        /* JADX INFO: renamed from: G */
        public void m48729G(@NonNull List<String> list) {
            this.f31288c = list;
            notifyDataSetChanged();
        }
    }

    public MarryEditProfileItemImagesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rhc0.f163148t);
        String string = typedArrayObtainStyledAttributes.getString(rhc0.f163149u);
        String string2 = typedArrayObtainStyledAttributes.getString(rhc0.f163151w);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context).inflate(sec0.f167535S, (ViewGroup) this, true);
        this.f31280d = (VText) findViewById(gdc0.f103666Y);
        this.f31281e = (VText) findViewById(gdc0.f103644C);
        this.f31282f = (VImage) findViewById(gdc0.f103652K);
        this.f31283g = (VImage) findViewById(gdc0.f103686n);
        this.f31284h = (VImage) findViewById(gdc0.f103653L);
        this.f31285i = (RecyclerView) findViewById(gdc0.f103645D);
        this.f31280d.setText(string);
        this.f31281e.setText(string2);
        C8615a c8615a = new C8615a();
        this.f31286j = c8615a;
        this.f31285i.setAdapter(c8615a);
        this.f31280d.setTypeface(lyh0.m156283c(3), 1);
        this.f31281e.setTypeface(lyh0.m156283c(3), 1);
    }

    private void setContentList(List<String> list) {
        boolean zM147479J = jyb.m147479J(list);
        VText vText = this.f31281e;
        if (zM147479J) {
            bnl0.m105524M(vText, true);
            bnl0.m105524M(this.f31284h, true);
            bnl0.m105524M(this.f31283g, false);
            bnl0.m105524M(this.f31285i, false);
            bnl0.m105524M(this.f31282f, this.f31287k.isRequired());
            return;
        }
        bnl0.m105524M(vText, false);
        bnl0.m105524M(this.f31284h, false);
        bnl0.m105524M(this.f31283g, true);
        bnl0.m105524M(this.f31285i, true);
        bnl0.m105524M(this.f31282f, false);
        this.f31286j.m48729G(list);
    }

    @Override // p153l.oyl
    /* JADX INFO: renamed from: d */
    public void mo48708d(User user) {
        super.mo48708d(user);
        List<String> arrayList = new ArrayList<>();
        if (NullChecker.m82486a(user.profile) && NullChecker.m82486a(user.profile.extensions) && NullChecker.m82486a(user.profile.extensions.marriage)) {
            arrayList = user.profile.extensions.marriage.lifeMoment;
        }
        setContentList(arrayList);
    }

    @Override // p153l.oyl
    /* JADX INFO: renamed from: d0 */
    public boolean mo48725d0() {
        return !bnl0.m105529O0(this.f31282f);
    }

    @Override // p153l.oyl
    public View getClickView() {
        return this;
    }

    @Override // p153l.oyl
    public MarrySeriesType getItemType() {
        return this.f31287k;
    }

    /* JADX INFO: renamed from: h0 */
    public oyl m48726h0(MarrySeriesType marrySeriesType) {
        this.f31287k = marrySeriesType;
        return this;
    }

    @Override // p153l.oyl
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
