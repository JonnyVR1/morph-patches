package p149l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p147v.VButton;
import p147v.VImage;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class is10 implements s7m<ur10> {

    /* JADX INFO: renamed from: a */
    public final Context f114716a;

    /* JADX INFO: renamed from: b */
    public ur10 f114717b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f114718c;

    /* JADX INFO: renamed from: d */
    public View f114719d;

    /* JADX INFO: renamed from: e */
    public TextView f114720e;

    /* JADX INFO: renamed from: f */
    public LiveBaseAdapter f114721f;

    /* JADX INFO: renamed from: g */
    public boolean f114722g;

    /* JADX INFO: renamed from: h */
    public View f114723h;

    /* JADX INFO: renamed from: i */
    public VButton f114724i;

    /* JADX INFO: renamed from: j */
    public VImage f114725j;

    /* JADX INFO: renamed from: k */
    public pp10 f114726k;

    /* JADX INFO: renamed from: l */
    public HashMap<String, IntlMusicBean> f114727l = new HashMap<>();

    /* JADX INFO: renamed from: m */
    public Group f114728m;

    /* JADX INFO: renamed from: n */
    public Group f114729n;

    public is10(Context context) {
        this.f114716a = context;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m137944l(ArrayList arrayList, d1q d1qVar) {
        if (d1qVar instanceof sr10) {
            sr10 sr10Var = (sr10) d1qVar;
            if (sr10Var.f166036c) {
                arrayList.add(sr10Var.f166034a);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m137946n(boolean z, d1q d1qVar) {
        if (d1qVar instanceof sr10) {
            sr10 sr10Var = (sr10) d1qVar;
            sr10Var.f166035b = z;
            if (z) {
                return;
            }
            sr10Var.f166036c = false;
        }
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m137948A(View view) {
        m137971s();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m137949B(View view) {
        VImage vImage = this.f114725j;
        vImage.setSelected(!vImage.isSelected());
        m137956J(this.f114725j.isSelected());
        m137967U();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m137950C(View view) {
        m137957K();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m137951E(View view) {
        this.f114717b.m195033v2();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m137952F(boolean z, d1q d1qVar) {
        if (d1qVar instanceof sr10) {
            sr10 sr10Var = (sr10) d1qVar;
            sr10Var.f166036c = z;
            m137969W(sr10Var, false);
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m137953G(sr10 sr10Var, View view) {
        m137964R(sr10Var);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m137954H(sr10 sr10Var, View view) {
        m137958L(sr10Var);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m137955I(sr10 sr10Var, View view) {
        m137966T(sr10Var);
    }

    /* JADX INFO: renamed from: J */
    public final void m137956J(final boolean z) {
        vwb.m200354z(this.f114721f.m67355J(), new e30() { // from class: l.es10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92975a.m137952F(z, (d1q) obj);
            }
        });
        this.f114721f.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public final void m137957K() {
        if (this.f114722g) {
            this.f114722g = false;
            this.f114725j.setSelected(false);
            xdl0.m208344M(this.f114723h, false);
            xdl0.m208344M(this.f114719d, true);
            this.f114720e.setText(R$string.f44899f);
            this.f114726k.m170679E(false);
        } else {
            this.f114720e.setText(R$string.f44897e);
            this.f114722g = true;
            xdl0.m208344M(this.f114723h, true);
            xdl0.m208344M(this.f114719d, false);
            this.f114726k.m170679E(true);
        }
        m137963Q(this.f114722g);
        this.f114727l.clear();
    }

    /* JADX INFO: renamed from: L */
    public final void m137958L(sr10 sr10Var) {
        if (this.f114722g) {
            return;
        }
        IntlMusicBean intlMusicBean = pr10.m170951f1().f150834e;
        IntlMusicBean intlMusicBean2 = sr10Var.f166034a;
        if (intlMusicBean == null || !TextUtils.equals(intlMusicBean.filePath, intlMusicBean2.filePath) || !intlMusicBean.isUsing()) {
            this.f114717b.m195036z2(intlMusicBean2);
            return;
        }
        boolean zIsPlaying = intlMusicBean.isPlaying();
        ur10 ur10Var = this.f114717b;
        if (zIsPlaying) {
            ur10Var.m195035y2();
        } else {
            ur10Var.m195028B2();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m137959M(IntlMusicBean intlMusicBean) {
        this.f114726k.m170694x(intlMusicBean);
        m137968V(intlMusicBean);
    }

    /* JADX INFO: renamed from: N */
    public void m137960N(IntlMusicBean intlMusicBean) {
        this.f114726k.m170695y(intlMusicBean);
        m137968V(intlMusicBean);
    }

    /* JADX INFO: renamed from: O */
    public void m137961O(IntlMusicBean intlMusicBean) {
        this.f114726k.m170696z(intlMusicBean);
        m137968V(intlMusicBean);
    }

    /* JADX INFO: renamed from: P */
    public void m137962P(IntlMusicBean intlMusicBean) {
        this.f114726k.m170675A();
        m137968V(intlMusicBean);
    }

    /* JADX INFO: renamed from: Q */
    public final void m137963Q(final boolean z) {
        vwb.m200354z(this.f114721f.m67355J(), new e30() { // from class: l.ds10
            @Override // p149l.e30
            public final void call(Object obj) {
                is10.m137946n(z, (d1q) obj);
            }
        });
        this.f114721f.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: R */
    public final void m137964R(sr10 sr10Var) {
        sr10Var.f166036c = !sr10Var.f166036c;
        m137969W(sr10Var, true);
        this.f114721f.m67360O(sr10Var);
    }

    /* JADX INFO: renamed from: S */
    public void m137965S(List<IntlMusicBean> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        boolean zM200296J = vwb.m200296J(list);
        xdl0.m208344M(this.f114729n, !zM200296J);
        xdl0.m208344M(this.f114728m, zM200296J);
        xdl0.m208344M(this.f114720e, !zM200296J);
        this.f114726k.m170677C(list);
        this.f114726k.m170681G(pr10.m170951f1().m170971l1());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            final sr10 sr10Var = new sr10(list.get(i));
            sr10Var.f166039f = i;
            sr10Var.mo109662A(new View.OnClickListener() { // from class: l.gs10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f104132a.m137954H(sr10Var, view);
                }
            });
            sr10Var.m185621J(new View.OnClickListener() { // from class: l.hs10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f109282a.m137955I(sr10Var, view);
                }
            });
            sr10Var.m185620I(new View.OnClickListener() { // from class: l.wr10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f187751a.m137953G(sr10Var, view);
                }
            });
            arrayList.add(sr10Var);
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(new tds(t100.m186890d(80.0f)));
        }
        this.f114721f.m67371Z(arrayList);
    }

    /* JADX INFO: renamed from: T */
    public final void m137966T(final sr10 sr10Var) {
        List<IntlMusicBean> listM170966g1 = pr10.m170951f1().m170966g1();
        IntlMusicBean intlMusicBean = (IntlMusicBean) vwb.m200346r(listM170966g1, new w9j() { // from class: l.yr10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(sr10Var.f166034a.filePath, ((IntlMusicBean) obj).filePath));
            }
        });
        ArrayList arrayList = new ArrayList();
        intlMusicBean.isSetTop = true;
        arrayList.add(intlMusicBean);
        for (int i = 0; i < listM170966g1.size(); i++) {
            IntlMusicBean intlMusicBean2 = listM170966g1.get(i);
            if (!TextUtils.equals(intlMusicBean.filePath, intlMusicBean2.filePath)) {
                intlMusicBean2.isSetTop = false;
                arrayList.add(intlMusicBean2);
            }
        }
        pr10.m170951f1().m170956E1(arrayList, true);
    }

    /* JADX INFO: renamed from: U */
    public final void m137967U() {
        boolean zIsEmpty = this.f114727l.isEmpty();
        VButton vButton = this.f114724i;
        if (zIsEmpty) {
            vButton.setEnabled(false);
            this.f114724i.setTextColor(Color.parseColor("#66FFFFFF"));
            this.f114724i.setBackgroundDrawable(yb2.m213876a(Color.parseColor("#7F4F2D"), t100.m186890d(10.0f), false));
        } else {
            vButton.setEnabled(true);
            this.f114724i.setTextColor(Color.parseColor("#E5FFFFFF"));
            this.f114724i.setBackgroundResource(h3c0.f105684l);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m137968V(final IntlMusicBean intlMusicBean) {
        sr10 sr10Var;
        LiveBaseAdapter liveBaseAdapter = this.f114721f;
        if (liveBaseAdapter == null || (sr10Var = (sr10) vwb.m200346r(liveBaseAdapter.m67355J(), new w9j() { // from class: l.xr10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((sr10) ((d1q) obj)).f166034a.filePath, intlMusicBean.filePath));
            }
        })) == null) {
            return;
        }
        sr10Var.f166034a.playStatus = intlMusicBean.playStatus;
        this.f114721f.m67360O(sr10Var);
    }

    /* JADX INFO: renamed from: W */
    public final void m137969W(sr10 sr10Var, boolean z) {
        boolean z2 = sr10Var.f166036c;
        HashMap<String, IntlMusicBean> map = this.f114727l;
        if (z2) {
            IntlMusicBean intlMusicBean = sr10Var.f166034a;
            map.put(intlMusicBean.filePath, intlMusicBean);
        } else {
            map.remove(sr10Var.f166034a.filePath);
        }
        if (z) {
            this.f114725j.setSelected(this.f114727l.size() == this.f114721f.m67355J().size() - 1);
        }
        m137967U();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162685M, (ViewGroup) null);
        m137976y(viewInflate);
        return viewInflate;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ur10 ur10Var) {
        this.f114717b = ur10Var;
    }

    /* JADX INFO: renamed from: s */
    public final void m137971s() {
        final ArrayList<IntlMusicBean> arrayList = new ArrayList<>();
        vwb.m200354z(this.f114721f.m67355J(), new e30() { // from class: l.fs10
            @Override // p149l.e30
            public final void call(Object obj) {
                is10.m137944l(arrayList, (d1q) obj);
            }
        });
        pr10.m170951f1().m170965e1(arrayList);
        this.f114720e.performClick();
    }

    /* JADX INFO: renamed from: u */
    public final void m137972u(View view) {
        View viewFindViewById = view.findViewById(f5c0.f95076c);
        this.f114719d = viewFindViewById;
        xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.vr10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f182691a.m137977z(view2);
            }
        });
        this.f114723h = view.findViewById(f5c0.f95050U);
        VButton vButton = (VButton) view.findViewById(f5c0.f95047T);
        this.f114724i = vButton;
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.zr10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f204451a.m137948A(view2);
            }
        });
        VImage vImage = (VImage) view.findViewById(f5c0.f94993E);
        this.f114725j = vImage;
        vImage.setOnClickListener(new View.OnClickListener() { // from class: l.as10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f71377a.m137949B(view2);
            }
        });
        this.f114728m = (Group) view.findViewById(f5c0.f95089f0);
        this.f114729n = (Group) view.findViewById(f5c0.f95032O);
    }

    /* JADX INFO: renamed from: v */
    public final void m137973v(View view) {
        this.f114726k = new pp10(this.f114717b, view);
    }

    /* JADX INFO: renamed from: w */
    public final void m137974w(View view) {
        this.f114718c = (VRecyclerView) view.findViewById(f5c0.f95030N0);
        this.f114718c.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f114721f = liveBaseAdapter;
        this.f114718c.setAdapter(liveBaseAdapter);
    }

    /* JADX INFO: renamed from: x */
    public final void m137975x(View view) {
        xdl0.m208360X(view.findViewById(f5c0.f95082d1), xdl0.m208331F0());
        TextView textView = (TextView) view.findViewById(f5c0.f95077c0);
        this.f114720e = textView;
        xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.bs10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f76969a.m137950C(view2);
            }
        });
        xdl0.m208329E0(view.findViewById(f5c0.f95160x), new View.OnClickListener() { // from class: l.cs10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f82315a.m137951E(view2);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public void m137976y(View view) {
        m137975x(view);
        m137974w(view);
        m137972u(view);
        m137973v(view);
        m137967U();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m137977z(View view) {
        this.f114717b.m195032u2();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
