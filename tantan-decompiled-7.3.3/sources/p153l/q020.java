package p153l;

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
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p151v.VButton;
import p151v.VImage;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class q020 implements iam<c020> {

    /* JADX INFO: renamed from: a */
    public final Context f155006a;

    /* JADX INFO: renamed from: b */
    public c020 f155007b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f155008c;

    /* JADX INFO: renamed from: d */
    public View f155009d;

    /* JADX INFO: renamed from: e */
    public TextView f155010e;

    /* JADX INFO: renamed from: f */
    public LiveBaseAdapter f155011f;

    /* JADX INFO: renamed from: g */
    public boolean f155012g;

    /* JADX INFO: renamed from: h */
    public View f155013h;

    /* JADX INFO: renamed from: i */
    public VButton f155014i;

    /* JADX INFO: renamed from: j */
    public VImage f155015j;

    /* JADX INFO: renamed from: k */
    public xx10 f155016k;

    /* JADX INFO: renamed from: l */
    public HashMap<String, IntlMusicBean> f155017l = new HashMap<>();

    /* JADX INFO: renamed from: m */
    public Group f155018m;

    /* JADX INFO: renamed from: n */
    public Group f155019n;

    public q020(Context context) {
        this.f155006a = context;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m174652l(ArrayList arrayList, d3q d3qVar) {
        if (d3qVar instanceof a020) {
            a020 a020Var = (a020) d3qVar;
            if (a020Var.f67681c) {
                arrayList.add(a020Var.f67679a);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m174654n(boolean z, d3q d3qVar) {
        if (d3qVar instanceof a020) {
            a020 a020Var = (a020) d3qVar;
            a020Var.f67680b = z;
            if (z) {
                return;
            }
            a020Var.f67681c = false;
        }
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m174656A(View view) {
        m174679s();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m174657B(View view) {
        VImage vImage = this.f155015j;
        vImage.setSelected(!vImage.isSelected());
        m174664J(this.f155015j.isSelected());
        m174675U();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m174658C(View view) {
        m174665K();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m174659E(View view) {
        this.f155007b.m107313v2();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m174660F(boolean z, d3q d3qVar) {
        if (d3qVar instanceof a020) {
            a020 a020Var = (a020) d3qVar;
            a020Var.f67681c = z;
            m174677W(a020Var, false);
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m174661G(a020 a020Var, View view) {
        m174672R(a020Var);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m174662H(a020 a020Var, View view) {
        m174666L(a020Var);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m174663I(a020 a020Var, View view) {
        m174674T(a020Var);
    }

    /* JADX INFO: renamed from: J */
    public final void m174664J(final boolean z) {
        jyb.m147537z(this.f155011f.m68538J(), new y20() { // from class: l.m020
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134291a.m174660F(z, (d3q) obj);
            }
        });
        this.f155011f.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public final void m174665K() {
        if (this.f155012g) {
            this.f155012g = false;
            this.f155015j.setSelected(false);
            bnl0.m105524M(this.f155013h, false);
            bnl0.m105524M(this.f155009d, true);
            this.f155010e.setText(R$string.f45747f);
            this.f155016k.m213471E(false);
        } else {
            this.f155010e.setText(R$string.f45745e);
            this.f155012g = true;
            bnl0.m105524M(this.f155013h, true);
            bnl0.m105524M(this.f155009d, false);
            this.f155016k.m213471E(true);
        }
        m174671Q(this.f155012g);
        this.f155017l.clear();
    }

    /* JADX INFO: renamed from: L */
    public final void m174666L(a020 a020Var) {
        if (this.f155012g) {
            return;
        }
        IntlMusicBean intlMusicBean = xz10.m213668f1().f196814e;
        IntlMusicBean intlMusicBean2 = a020Var.f67679a;
        if (intlMusicBean == null || !TextUtils.equals(intlMusicBean.filePath, intlMusicBean2.filePath) || !intlMusicBean.isUsing()) {
            this.f155007b.m107317z2(intlMusicBean2);
            return;
        }
        boolean zIsPlaying = intlMusicBean.isPlaying();
        c020 c020Var = this.f155007b;
        if (zIsPlaying) {
            c020Var.m107316y2();
        } else {
            c020Var.m107303B2();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m174667M(IntlMusicBean intlMusicBean) {
        this.f155016k.m213486x(intlMusicBean);
        m174676V(intlMusicBean);
    }

    /* JADX INFO: renamed from: N */
    public void m174668N(IntlMusicBean intlMusicBean) {
        this.f155016k.m213487y(intlMusicBean);
        m174676V(intlMusicBean);
    }

    /* JADX INFO: renamed from: O */
    public void m174669O(IntlMusicBean intlMusicBean) {
        this.f155016k.m213488z(intlMusicBean);
        m174676V(intlMusicBean);
    }

    /* JADX INFO: renamed from: P */
    public void m174670P(IntlMusicBean intlMusicBean) {
        this.f155016k.m213467A();
        m174676V(intlMusicBean);
    }

    /* JADX INFO: renamed from: Q */
    public final void m174671Q(final boolean z) {
        jyb.m147537z(this.f155011f.m68538J(), new y20() { // from class: l.l020
            @Override // p153l.y20
            public final void call(Object obj) {
                q020.m174654n(z, (d3q) obj);
            }
        });
        this.f155011f.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: R */
    public final void m174672R(a020 a020Var) {
        a020Var.f67681c = !a020Var.f67681c;
        m174677W(a020Var, true);
        this.f155011f.m68543O(a020Var);
    }

    /* JADX INFO: renamed from: S */
    public void m174673S(List<IntlMusicBean> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        boolean zM147479J = jyb.m147479J(list);
        bnl0.m105524M(this.f155019n, !zM147479J);
        bnl0.m105524M(this.f155018m, zM147479J);
        bnl0.m105524M(this.f155010e, !zM147479J);
        this.f155016k.m213469C(list);
        this.f155016k.m213473G(xz10.m213668f1().m213688l1());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            final a020 a020Var = new a020(list.get(i));
            a020Var.f67684f = i;
            a020Var.mo113881A(new View.OnClickListener() { // from class: l.o020
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f144490a.m174662H(a020Var, view);
                }
            });
            a020Var.m95295J(new View.OnClickListener() { // from class: l.p020
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f150001a.m174663I(a020Var, view);
                }
            });
            a020Var.m95294I(new View.OnClickListener() { // from class: l.e020
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f91406a.m174661G(a020Var, view);
                }
            });
            arrayList.add(a020Var);
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(new ufs(qa00.m175859d(80.0f)));
        }
        this.f155011f.m68554Z(arrayList);
    }

    /* JADX INFO: renamed from: T */
    public final void m174674T(final a020 a020Var) {
        List<IntlMusicBean> listM213683g1 = xz10.m213668f1().m213683g1();
        IntlMusicBean intlMusicBean = (IntlMusicBean) jyb.m147529r(listM213683g1, new qcj() { // from class: l.g020
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(a020Var.f67679a.filePath, ((IntlMusicBean) obj).filePath));
            }
        });
        ArrayList arrayList = new ArrayList();
        intlMusicBean.isSetTop = true;
        arrayList.add(intlMusicBean);
        for (int i = 0; i < listM213683g1.size(); i++) {
            IntlMusicBean intlMusicBean2 = listM213683g1.get(i);
            if (!TextUtils.equals(intlMusicBean.filePath, intlMusicBean2.filePath)) {
                intlMusicBean2.isSetTop = false;
                arrayList.add(intlMusicBean2);
            }
        }
        xz10.m213668f1().m213673E1(arrayList, true);
    }

    /* JADX INFO: renamed from: U */
    public final void m174675U() {
        boolean zIsEmpty = this.f155017l.isEmpty();
        VButton vButton = this.f155014i;
        if (zIsEmpty) {
            vButton.setEnabled(false);
            this.f155014i.setTextColor(Color.parseColor("#66FFFFFF"));
            this.f155014i.setBackgroundDrawable(fc2.m124971a(Color.parseColor("#7F4F2D"), qa00.m175859d(10.0f), false));
        } else {
            vButton.setEnabled(true);
            this.f155014i.setTextColor(Color.parseColor("#E5FFFFFF"));
            this.f155014i.setBackgroundResource(nbc0.f141175l);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m174676V(final IntlMusicBean intlMusicBean) {
        a020 a020Var;
        LiveBaseAdapter liveBaseAdapter = this.f155011f;
        if (liveBaseAdapter == null || (a020Var = (a020) jyb.m147529r(liveBaseAdapter.m68538J(), new qcj() { // from class: l.f020
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((a020) ((d3q) obj)).f67679a.filePath, intlMusicBean.filePath));
            }
        })) == null) {
            return;
        }
        a020Var.f67679a.playStatus = intlMusicBean.playStatus;
        this.f155011f.m68543O(a020Var);
    }

    /* JADX INFO: renamed from: W */
    public final void m174677W(a020 a020Var, boolean z) {
        boolean z2 = a020Var.f67681c;
        HashMap<String, IntlMusicBean> map = this.f155017l;
        if (z2) {
            IntlMusicBean intlMusicBean = a020Var.f67679a;
            map.put(intlMusicBean.filePath, intlMusicBean);
        } else {
            map.remove(a020Var.f67679a.filePath);
        }
        if (z) {
            this.f155015j.setSelected(this.f155017l.size() == this.f155011f.m68538J().size() - 1);
        }
        m174675U();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193799M, (ViewGroup) null);
        m174684y(viewInflate);
        return viewInflate;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(c020 c020Var) {
        this.f155007b = c020Var;
    }

    /* JADX INFO: renamed from: s */
    public final void m174679s() {
        final ArrayList<IntlMusicBean> arrayList = new ArrayList<>();
        jyb.m147537z(this.f155011f.m68538J(), new y20() { // from class: l.n020
            @Override // p153l.y20
            public final void call(Object obj) {
                q020.m174652l(arrayList, (d3q) obj);
            }
        });
        xz10.m213668f1().m213682e1(arrayList);
        this.f155010e.performClick();
    }

    /* JADX INFO: renamed from: u */
    public final void m174680u(View view) {
        View viewFindViewById = view.findViewById(ldc0.f131533c);
        this.f155009d = viewFindViewById;
        bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.d020
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f84523a.m174685z(view2);
            }
        });
        this.f155013h = view.findViewById(ldc0.f131507U);
        VButton vButton = (VButton) view.findViewById(ldc0.f131504T);
        this.f155014i = vButton;
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.h020
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f107266a.m174656A(view2);
            }
        });
        VImage vImage = (VImage) view.findViewById(ldc0.f131450E);
        this.f155015j = vImage;
        vImage.setOnClickListener(new View.OnClickListener() { // from class: l.i020
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f112326a.m174657B(view2);
            }
        });
        this.f155018m = (Group) view.findViewById(ldc0.f131546f0);
        this.f155019n = (Group) view.findViewById(ldc0.f131489O);
    }

    /* JADX INFO: renamed from: v */
    public final void m174681v(View view) {
        this.f155016k = new xx10(this.f155007b, view);
    }

    /* JADX INFO: renamed from: w */
    public final void m174682w(View view) {
        this.f155008c = (VRecyclerView) view.findViewById(ldc0.f131487N0);
        this.f155008c.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f155011f = liveBaseAdapter;
        this.f155008c.setAdapter(liveBaseAdapter);
    }

    /* JADX INFO: renamed from: x */
    public final void m174683x(View view) {
        bnl0.m105540X(view.findViewById(ldc0.f131539d1), bnl0.m105511F0());
        TextView textView = (TextView) view.findViewById(ldc0.f131534c0);
        this.f155010e = textView;
        bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.j020
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f117775a.m174658C(view2);
            }
        });
        bnl0.m105509E0(view.findViewById(ldc0.f131617x), new View.OnClickListener() { // from class: l.k020
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f123353a.m174659E(view2);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public void m174684y(View view) {
        m174683x(view);
        m174682w(view);
        m174680u(view);
        m174681v(view);
        m174675U();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m174685z(View view) {
        this.f155007b.m107312u2();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
