package com.p000p1.mobile.putong.feed.newui.mediapicker.post;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.data.Audio;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaMeta;
import com.p000p1.mobile.putong.data.MessageLocation;
import com.p000p1.mobile.putong.data.TopicMomentIdBox;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.MomentShareInfoParcelable;
import com.p000p1.mobile.putong.feed.data.NewMomentDraft;
import com.p000p1.mobile.putong.feed.data.NotifyUsers;
import com.p000p1.mobile.putong.feed.data.TopicCategorie;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewCaptionMediaView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.span.FeedTitleTagsSpan;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.state.FeedMomentPostStatusView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.view.FeedPostMediaRecyclerView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedSharelinkView;
import com.p000p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l.d30;
import l.e30;
import l.e51;
import l.f30;
import l.hpd0;
import l.j760;
import l.mkd0;
import l.qib0;
import l.s7m;
import l.soe;
import l.t100;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xh0;
import l.zvf0;
import org.apmem.tools.layouts.FlowLayout;
import p007l.a8c0;
import p007l.c3h;
import p007l.e1c0;
import p007l.eqg;
import p007l.f2j0;
import p007l.f3c0;
import p007l.f640;
import p007l.fyl;
import p007l.hyh;
import p007l.lrh;
import p007l.n2h;
import p007l.nkg;
import p007l.nlg;
import p007l.nt4;
import p007l.od80;
import p007l.orh;
import p007l.p6j0;
import p007l.r440;
import p007l.rih;
import p007l.tmg;
import p007l.u1j0;
import p007l.u2h;
import p007l.uzb0;
import p007l.vqg;
import p007l.wng;
import p007l.xzi0;
import p007l.zyi0;
import v.VCheckBox;
import v.VImage;
import v.VLinear;
import v.VScroll;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class C2090b implements s7m<C2089a>, fyl {

    /* JADX INFO: renamed from: X */
    public static int f2145X = t100.d(290.0f);

    /* JADX INFO: renamed from: A */
    public FeedPostBottomView f2146A;

    /* JADX INFO: renamed from: B */
    public FrameLayout f2147B;

    /* JADX INFO: renamed from: C */
    public FrameLayout f2148C;

    /* JADX INFO: renamed from: E */
    public c3h<TopicMoment> f2150E;

    /* JADX INFO: renamed from: F */
    public NewPostAct f2151F;

    /* JADX INFO: renamed from: G */
    public od80 f2152G;

    /* JADX INFO: renamed from: H */
    public LinearLayoutManager f2153H;

    /* JADX INFO: renamed from: I */
    public C2089a f2154I;

    /* JADX INFO: renamed from: J */
    public MessageLocation f2155J;

    /* JADX INFO: renamed from: K */
    public String f2156K;

    /* JADX INFO: renamed from: L */
    public boolean f2157L;

    /* JADX INFO: renamed from: N */
    public NewMomentDraft f2159N;

    /* JADX INFO: renamed from: O */
    public f2j0 f2160O;

    /* JADX INFO: renamed from: P */
    public zyi0 f2161P;

    /* JADX INFO: renamed from: Q */
    public boolean f2162Q;

    /* JADX INFO: renamed from: R */
    public boolean f2163R;

    /* JADX INFO: renamed from: S */
    public lrh f2164S;

    /* JADX INFO: renamed from: T */
    public nt4 f2165T;

    /* JADX INFO: renamed from: U */
    public tmg f2166U;

    /* JADX INFO: renamed from: V */
    public eqg f2167V;

    /* JADX INFO: renamed from: a */
    public VLinear f2169a;

    /* JADX INFO: renamed from: b */
    public VImage f2170b;

    /* JADX INFO: renamed from: c */
    public FeedMomentPostStatusView f2171c;

    /* JADX INFO: renamed from: d */
    public TextView f2172d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f2173e;

    /* JADX INFO: renamed from: f */
    public VScroll f2174f;

    /* JADX INFO: renamed from: g */
    public FeedEditText f2175g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f2176h;

    /* JADX INFO: renamed from: i */
    public View f2177i;

    /* JADX INFO: renamed from: j */
    public FeedPostMediaRecyclerView f2178j;

    /* JADX INFO: renamed from: k */
    public RelativeLayout f2179k;

    /* JADX INFO: renamed from: l */
    public FeedAudioPlayerView f2180l;

    /* JADX INFO: renamed from: m */
    public VImage f2181m;

    /* JADX INFO: renamed from: n */
    public FeedSharelinkView f2182n;

    /* JADX INFO: renamed from: o */
    public FlowLayout f2183o;

    /* JADX INFO: renamed from: p */
    public VLinear f2184p;

    /* JADX INFO: renamed from: q */
    public VImage f2185q;

    /* JADX INFO: renamed from: r */
    public VText f2186r;

    /* JADX INFO: renamed from: s */
    public VImage f2187s;

    /* JADX INFO: renamed from: t */
    public VLinear f2188t;

    /* JADX INFO: renamed from: u */
    public VImage f2189u;

    /* JADX INFO: renamed from: v */
    public VText f2190v;

    /* JADX INFO: renamed from: w */
    public VImage f2191w;

    /* JADX INFO: renamed from: x */
    public RelativeLayout f2192x;

    /* JADX INFO: renamed from: y */
    public VCheckBox f2193y;

    /* JADX INFO: renamed from: z */
    public VText f2194z;

    /* JADX INFO: renamed from: D */
    public int f2149D = f2145X;

    /* JADX INFO: renamed from: M */
    public int f2158M = 1500;

    /* JADX INFO: renamed from: W */
    public hpd0 f2168W = new hpd0("has_show_post_moment_long_click_tip" + qib0.b0.a.userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.b$a */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (nkg.m12273x() && NullChecker.a(C2090b.this.f2166U)) {
                C2090b.this.f2166U.m14570b(editable, C2090b.this.f2154I.f2118H, C2090b.this.f2154I.f2117G);
                if (!vwb.J(C2090b.this.f2154I.f2118H)) {
                    for (NotifyUsers notifyUsers : C2090b.this.f2154I.f2118H) {
                        final TopicMoment topicMomentNew_ = TopicMoment.new_();
                        TopicMomentIdBox topicMomentIdBox = notifyUsers.topic;
                        topicMomentNew_.f708id = topicMomentIdBox.f285id;
                        topicMomentNew_.name = topicMomentIdBox.name;
                        if (!vwb.m(C2090b.this.f2154I.f2123e, new w9j() { // from class: l.d640
                            public final Object call(Object obj) {
                                return Boolean.valueOf(TextUtils.equals(((TopicMoment) obj).f708id, topicMomentNew_.f708id));
                            }
                        }) && C2090b.this.f2154I.f2123e.size() < 3) {
                            C2090b.this.f2154I.f2123e.add(topicMomentNew_);
                            C2090b.this.f2154I.m3766S1(C2090b.this.f2154I.f2123e);
                        }
                    }
                }
            }
            xdl0.M(C2090b.this.f2194z, false);
            C2090b.this.m3866J1();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m3944c() {
            C2090b.this.m3872O1(true);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2;
            int i4;
            int i5;
            int i6;
            if (!NullChecker.a(C2090b.this.f2161P) || C2090b.this.f2163R) {
                charSequence2 = charSequence;
                i4 = i;
                i5 = i2;
                i6 = i3;
                C2090b.this.f2163R = false;
            } else {
                C2090b.this.f2163R = false;
                charSequence2 = charSequence;
                i4 = i;
                i5 = i2;
                i6 = i3;
                C2090b.this.f2161P.m17605k(C2090b.this.f2175g, charSequence2, i4, i5, i6);
            }
            if (NullChecker.a(C2090b.this.f2166U)) {
                int i7 = i5;
                int i8 = i6;
                C2090b.this.f2166U.m14574f(C2090b.this.f2175g, charSequence2, i4, i7, i8, new d30() { // from class: l.e640
                    public final void call() {
                        this.f7227a.m3944c();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.b$b */
    public class b extends RecyclerView.n {
        public b() {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            rect.left = 0;
            rect.right = t100.d(NewCaptionMediaView.f1930f);
            rect.top = t100.d(NewCaptionMediaView.f1930f);
            rect.bottom = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.b$c */
    public class c extends k.e {

        /* JADX INFO: renamed from: d */
        public boolean f2197d;

        /* JADX INFO: renamed from: e */
        public RecyclerView.d0 f2198e;

        public c() {
        }

        /* JADX INFO: renamed from: A */
        public void m3945A(@Nullable RecyclerView.d0 d0Var, int i) {
            super.A(d0Var, i);
            int childCount = C2090b.this.f2178j.getLayoutManager().getChildCount();
            if (i != 0) {
                if (this.f2198e == null) {
                    this.f2198e = d0Var;
                }
                C2090b.this.m3892Z1(this.f2198e, childCount, false);
            } else {
                C2090b.this.m3892Z1(this.f2198e, childCount, true);
                this.f2198e = null;
            }
            if (this.f2197d) {
                C2090b.this.f2146A.m4058o1(false);
            }
        }

        /* JADX INFO: renamed from: B */
        public void m3946B(RecyclerView.d0 d0Var, int i) {
        }

        /* JADX INFO: renamed from: k */
        public int m3947k(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
            int itemViewType = d0Var.getItemViewType();
            od80 unused = C2090b.this.f2152G;
            if (itemViewType != 0) {
                return 0;
            }
            return k.e.t(15, 0);
        }

        /* JADX INFO: renamed from: y */
        public boolean m3948y(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            int adapterPosition = d0Var.getAdapterPosition();
            int adapterPosition2 = d0Var2.getAdapterPosition();
            ArrayList<Media> arrayListM3784g1 = C2090b.this.f2154I.m3784g1();
            if (adapterPosition2 != arrayListM3784g1.size() && adapterPosition != arrayListM3784g1.size()) {
                if (adapterPosition < adapterPosition2) {
                    int i = adapterPosition;
                    while (i < adapterPosition2) {
                        int i2 = i + 1;
                        if (i2 >= arrayListM3784g1.size()) {
                            break;
                        }
                        Collections.swap(arrayListM3784g1, i, i2);
                        i = i2;
                    }
                } else {
                    for (int i3 = adapterPosition; i3 > adapterPosition2 && i3 > 0; i3--) {
                        Collections.swap(arrayListM3784g1, i3, i3 - 1);
                    }
                }
                this.f2197d = true;
                C2090b.this.f2146A.setSelectedImages(arrayListM3784g1);
                C2090b.this.f2152G.notifyItemMoved(adapterPosition, adapterPosition2);
            }
            return true;
        }
    }

    public C2090b(NewPostAct newPostAct) {
        this.f2151F = newPostAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m3810L0(View view) {
        zvf0.u("e_poi_tag", "p_moment_post", new j760[]{vwb.Y("poitagshow", Integer.valueOf(this.f2154I.f2141w ? 1 : 0))});
        m3922p1();
    }

    /* JADX INFO: renamed from: L1 */
    private void m3811L1(Integer num) {
        if (num.intValue() != 0 && this.f2149D != num.intValue()) {
            this.f2149D = num.intValue();
        }
        this.f2146A.setAlbumHeight(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public /* synthetic */ void m3813M0(View view) {
        if (NullChecker.a(view)) {
            xdl0.E0(view, new View.OnClickListener() { // from class: l.x440
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f14761a.m3810L0(view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m3822U0(View view) {
        this.f2151F.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m3824V0(View view) {
        this.f2151F.m3692c2();
    }

    /* JADX INFO: renamed from: b0 */
    private void m3829b0() {
        new k(new c()).g(this.f2178j);
    }

    /* JADX INFO: renamed from: A0 */
    public void m3849A0() {
        int iIntValue = ((Integer) Act.savedKeyboardHeight.get()).intValue();
        if (iIntValue == 0 || iIntValue == t100.d(220.0f)) {
            return;
        }
        this.f2149D = iIntValue;
    }

    /* JADX INFO: renamed from: A1 */
    public void m3850A1(ArrayList<Media> arrayList) {
        if (arrayList.size() > 0) {
            Media media = arrayList.get(0);
            if (media instanceof Audio) {
                m3926r1((Audio) media);
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m3851B0() {
        this.f2151F.lifecycle().subscribe(mkd0.G(new e30() { // from class: l.s540
            public final void call(Object obj) {
                this.f12796a.m3881T0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B1 */
    public final void m3852B1(Boolean bool, Integer num) {
        this.f2162Q = bool.booleanValue();
        m3811L1(num);
        this.f2146A.m4063t1(bool);
        if (nkg.m12258p0() && NullChecker.a(this.f2160O)) {
            boolean zBooleanValue = bool.booleanValue();
            f2j0 f2j0Var = this.f2160O;
            if (zBooleanValue) {
                f2j0Var.m10010G(num.intValue());
            } else {
                f2j0Var.m10017m();
            }
        }
        if (nkg.m12273x() && NullChecker.a(this.f2165T)) {
            boolean zBooleanValue2 = bool.booleanValue();
            nt4 nt4Var = this.f2165T;
            if (zBooleanValue2) {
                nt4Var.m12322r(num.intValue());
            } else {
                nt4Var.m12312h();
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m3853C0() {
        return this.f2151F;
    }

    /* JADX INFO: renamed from: C1 */
    public void m3854C1(boolean z) {
        this.f2146A.m4064u1(z);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: D0 */
    public void m3855D0(Bundle bundle) {
        m3911k0();
        m3876Q1();
        m3860G1();
        if (u2h.m14723h()) {
            this.f2170b.setImageResource(f3c0.f7639J3);
            Drawable drawable = this.f2151F.getResources().getDrawable(f3c0.f7675O3);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            this.f2172d.setCompoundDrawables(null, null, drawable, null);
            this.f2172d.setCompoundDrawablePadding(t100.d(2.0f));
            soe.a(this.f2175g);
            this.f2175g.setHintTextColor(this.f2151F.getResources().getColor(e1c0.f7142h));
            this.f2175g.setTextColor(this.f2151F.getResources().getColor(e1c0.f7140g));
        }
        xdl0.E0(this.f2170b, new View.OnClickListener() { // from class: l.a540
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5585a.m3822U0(view);
            }
        });
        this.f2172d.setClickable(false);
        xdl0.E0(this.f2172d, new View.OnClickListener() { // from class: l.b540
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5930a.m3824V0(view);
            }
        });
        if (nkg.m12268u0()) {
            xdl0.M(this.f2171c, true);
            this.f2171c.m4079R(this.f2151F);
            this.f2154I.m3782d1();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m3856E0() {
        if (vqg.m15528m0()) {
            m3851B0();
            this.f2146A.m4036K0(new d30() { // from class: l.e540
                public final void call() {
                    this.f7216a.m3885W0();
                }
            });
            this.f2181m.setOnClickListener(new View.OnClickListener() { // from class: l.f540
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7986a.m3886X0(view);
                }
            });
        }
        if (nkg.m12258p0()) {
            this.f2160O = new f2j0(this.f2151F, this.f2147B);
            this.f2146A.f2239e.setAddTopicClickHooker(new d30() { // from class: l.g540
                public final void call() {
                    this.f8352a.m3888Y0();
                }
            });
            this.f2160O.m10005B(new d30() { // from class: l.h540
                public final void call() {
                    this.f8598a.m3891Z0();
                }
            });
            this.f2160O.m10004A(new v9j() { // from class: l.i540
                public final Object call() {
                    return this.f8902a.m3895a1();
                }
            });
            this.f2160O.m10006C(new e30() { // from class: l.j540
                public final void call(Object obj) {
                    this.f9226a.m3898d1((String) obj);
                }
            });
            this.f2160O.m10008E(new e30() { // from class: l.k540
                public final void call(Object obj) {
                    this.f9612a.m3900e1((TopicMoment) obj);
                }
            });
            this.f2160O.m10007D(new f30() { // from class: l.l540
                public final void call(Object obj, Object obj2) {
                    this.f9883a.m3902f1((String) obj, (List) obj2);
                }
            });
            this.f2161P = new zyi0(this.f2154I, this.f2160O);
        }
        if (nkg.m12273x()) {
            nt4 nt4Var = new nt4(this.f2151F, this.f2148C);
            this.f2165T = nt4Var;
            nt4Var.m12320p(new e30() { // from class: l.m540
                public final void call(Object obj) {
                    this.f10231a.m3904g1((String) obj);
                }
            });
            this.f2166U = new tmg(this.f2165T);
        }
    }

    /* JADX INFO: renamed from: E1 */
    public final void m3857E1(NewMomentDraft newMomentDraft) {
        ArrayList<Media> arrayList = (ArrayList) newMomentDraft.images;
        if (!vwb.J(arrayList) && (arrayList.get(0) instanceof Audio)) {
            m3933v0(0.0f, -1.0f);
            e51.H(act(), new Runnable() { // from class: l.d540
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6822a.m3914l1();
                }
            }, 500L);
        }
        m3941z1(arrayList);
        this.f2154I.f2122d.onNext((ArrayList) newMomentDraft.images);
    }

    /* JADX INFO: renamed from: F1 */
    public void m3858F1(ArrayList<Media> arrayList) {
        if (!this.f2154I.m3792o1(arrayList)) {
            arrayList = new ArrayList<>();
        }
        if (NullChecker.a(this.f2152G)) {
            this.f2152G.m12534H(arrayList);
            if (!((Boolean) this.f2168W.get()).booleanValue() && NullChecker.a(arrayList) && arrayList.size() >= 2) {
                this.f2168W.put(Boolean.TRUE);
                m3883U1();
            }
            if (arrayList == null || arrayList.size() < 2) {
                m3909j0();
            }
            if (nkg.m12220R() && !vwb.J(arrayList) && (arrayList.get(0) instanceof Video)) {
                m3874P1(true);
            } else {
                m3874P1(false);
            }
            if (vwb.J(arrayList) || !(arrayList.get(0) instanceof Video)) {
                xdl0.U(this.f2178j, t100.d(13.0f));
            } else {
                xdl0.U(this.f2178j, t100.m);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: G0 */
    public final boolean m3859G0(float f, float f2) {
        int[] iArr = new int[2];
        this.f2175g.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return f >= ((float) i) && f <= ((float) (i + this.f2175g.getWidth())) && f2 >= ((float) i2) && f2 <= ((float) (i2 + this.f2175g.getHeight()));
    }

    /* JADX INFO: renamed from: G1 */
    public void m3860G1() {
        MomentShareInfoParcelable momentShareInfoParcelable = this.f2154I.f2135q;
        FeedSharelinkView feedSharelinkView = this.f2182n;
        if (momentShareInfoParcelable == null) {
            xdl0.M(feedSharelinkView, false);
            return;
        }
        xdl0.M(feedSharelinkView, true);
        this.f2182n.m6333e(this.f2154I.f2135q, "p_moment_post");
        this.f2182n.setCanClick(false);
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m3861H0(float f, float f2) {
        return f2 > 0.0f && !m3859G0(f, f2);
    }

    /* JADX INFO: renamed from: H1 */
    public void m3862H1(String str) {
        this.f2146A.m4068y1(str);
    }

    /* JADX INFO: renamed from: I1 */
    public void m3864I1(ArrayList<TopicMoment> arrayList) {
        this.f2146A.m4070z1();
        if (!NullChecker.a(arrayList) || arrayList.size() <= 0) {
            xdl0.M(this.f2183o, false);
        } else {
            xdl0.M(this.f2183o, true);
        }
        ((xzi0) this.f2150E).m16881E(arrayList);
    }

    /* JADX INFO: renamed from: J1 */
    public void m3866J1() {
        boolean zM3919o0 = m3919o0();
        this.f2172d.setClickable(zM3919o0);
        this.f2151F.m3688Y1(zM3919o0, this.f2172d);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m3867K0(CharSequence charSequence) {
        m3866J1();
    }

    /* JADX INFO: renamed from: K1 */
    public void m3868K1(j760<List<TopicCategorie>, List<TopicMoment>> j760Var) {
        this.f2146A.m4024B1(j760Var);
    }

    /* JADX INFO: renamed from: M1 */
    public final void m3869M1(Media media) {
        if (NullChecker.a(media.meta)) {
            return;
        }
        MediaMeta mediaMetaNew_ = MediaMeta.new_();
        media.meta = mediaMetaNew_;
        mediaMetaNew_.type = "voice";
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m3870N0(View view) {
        this.f2155J = null;
        m3925r0().setText(null);
        m3923q0().setVisibility(8);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m3871O0() {
        p6j0.m12913c("e_moment_at", "p_moment_post", new j760[0]);
        m3896c0();
    }

    /* JADX INFO: renamed from: O1 */
    public final void m3872O1(final boolean z) {
        if (this.f2164S == null) {
            this.f2164S = new lrh(this.f2151F, a8c0.f5636e, new d30() { // from class: l.q540
                public final void call() {
                    this.f12089a.m3916m1();
                }
            }).m11706t(false);
        }
        this.f2164S.m11709z(orh.m12747c());
        this.f2164S.m11705A(new e30() { // from class: l.r540
            public final void call(Object obj) {
                this.f12486a.m3918n1(z, (NotifyUsers) obj);
            }
        });
        this.f2164S.show();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m3873P0(String str) {
        if (TextUtils.equals(str, "everyone")) {
            m3874P1(true);
        } else {
            m3874P1(false);
        }
    }

    /* JADX INFO: renamed from: P1 */
    public void m3874P1(boolean z) {
        if (xdl0.O0(this.f2192x) && z) {
            return;
        }
        if (z) {
            zvf0.A("e_allow_forwarding", "p_moment_post", new j760[]{new j760("selection_situation", 1)});
        }
        xdl0.M(this.f2192x, z);
        this.f2193y.setChecked(z);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m3875Q0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f2174f.getLayoutParams();
        layoutParams.bottomMargin = this.f2173e.getHeight() - i2;
        this.f2174f.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m3876Q1() {
        e51.H(act(), new Runnable() { // from class: l.t540
            @Override // java.lang.Runnable
            public final void run() {
                this.f13193a.m3920o1();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ boolean m3877R0(View view, int i, KeyEvent keyEvent) {
        if (i != 67 || keyEvent.getAction() != 0) {
            return false;
        }
        if (NullChecker.a(this.f2166U)) {
            this.f2166U.m14573e(this.f2175g.getText());
        }
        if (!NullChecker.a(this.f2167V)) {
            return false;
        }
        this.f2167V.m9950e(this.f2175g.getText());
        return false;
    }

    /* JADX INFO: renamed from: R1 */
    public void m3878R1() {
        if (!NullChecker.a(this.f2154I.f2133o)) {
            this.f2155J = null;
            m3925r0().setText(null);
            m3923q0().setVisibility(8);
            return;
        }
        MessageLocation messageLocation = new MessageLocation();
        this.f2155J = messageLocation;
        C2089a c2089a = this.f2154I;
        messageLocation.name = c2089a.f2131m;
        messageLocation.address = c2089a.f2132n;
        messageLocation.coordinates = c2089a.f2133o;
        m3925r0().setText(this.f2155J.name);
        m3923q0().setVisibility(0);
        zvf0.A("e_poi_tag", "p_moment_post", new j760[]{vwb.Y("poitagshow", Integer.valueOf(this.f2154I.f2141w ? 1 : 0))});
    }

    /* JADX INFO: renamed from: S1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m3914l1() {
        xdl0.A(this.f2175g);
        act().showInput(this.f2175g, 0);
        this.f2175g.requestFocus();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m3881T0(com.p1.mobile.android.app.c cVar) {
        if (cVar == com.p1.mobile.android.app.c.j) {
            this.f2146A.m4035J1();
        }
    }

    /* JADX INFO: renamed from: T1 */
    public final void m3882T1(Audio audio) {
        this.f2154I.m3784g1().clear();
        this.f2154I.f2134p = audio;
        this.f2179k.setVisibility(0);
        this.f2180l.m7439X0(audio.duration, audio.url);
        m3866J1();
        m3869M1(audio);
    }

    /* JADX INFO: renamed from: U1 */
    public final void m3883U1() {
        this.f2156K = d.l().t(new com.p1.mobile.android.ui.bubble.a(this.f2151F).D(this.f2151F.getResources().getString(R$string.f366H1)).o(com.p1.mobile.android.ui.bubble.a.O, t100.d(8.0f)).q(com.p1.mobile.android.ui.bubble.a.Q | com.p1.mobile.android.ui.bubble.a.O).b(3000L), this.f2177i);
    }

    /* JADX INFO: renamed from: V1 */
    public void m3884V1(boolean z) {
        this.f2146A.m4037K1(z);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m3885W0() {
        if (NullChecker.a(this.f2165T)) {
            this.f2165T.m12311g();
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m3886X0(View view) {
        m3907i0();
    }

    /* JADX INFO: renamed from: X1 */
    public boolean m3887X1() {
        return this.f2146A.m4039L1();
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m3888Y0() {
        zvf0.r("e_create_topic", "p_moment_post");
        if (!this.f2162Q) {
            this.f2175g.requestFocus();
            this.f2151F.showInput(this.f2175g, 0);
        }
        int selectionStart = this.f2175g.getSelectionStart();
        Editable text = this.f2175g.getText();
        if (selectionStart <= 0 || !"#".equals(text.subSequence(selectionStart - 1, selectionStart).toString())) {
            n2h.m12065a(this.f2175g, "#");
            return;
        }
        this.f2161P.m17597c();
        this.f2160O.m10009F();
        this.f2160O.m10028x("");
    }

    /* JADX INFO: renamed from: Y1 */
    public void m3889Y1() {
        if (nkg.m12268u0()) {
            this.f2171c.m4082l0(this.f2154I.m3783e1());
        }
    }

    /* JADX INFO: renamed from: Z */
    public View m3890Z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f640.m10068b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m3891Z0() {
        this.f2146A.f2239e.m3992G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z1 */
    public final void m3892Z1(RecyclerView.d0 d0Var, int i, boolean z) {
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = this.f2178j.getLayoutManager().getChildAt(i2);
            if (NullChecker.a(d0Var) && childAt == d0Var.itemView) {
                ((NewCaptionMediaView) childAt).setImageDeleteVisible(z);
            } else {
                childAt.setScaleX(z ? 1.0f : 0.9f);
                childAt.setScaleY(z ? 1.0f : 0.9f);
            }
        }
    }

    @Override // p007l.fyl
    /* JADX INFO: renamed from: a */
    public void mo3893a() {
        this.f2154I.m3785h1(this.f2152G.m12533G());
    }

    /* JADX INFO: renamed from: a0 */
    public void m3894a0(String str, boolean z) {
        String string = this.f2175g.getText().toString();
        String strSubstring = (string.length() <= 0 || !z) ? "" : string.substring(string.length() - 1);
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.equals(strSubstring, "@") ? "" : "@");
        sb.append(str);
        this.f2175g.getText().insert(Selection.getSelectionEnd(this.f2175g.getText()), sb.toString());
        this.f2146A.m4040M1(Integer.valueOf(this.f2149D));
        e51.H(act(), new Runnable() { // from class: l.u540
            @Override // java.lang.Runnable
            public final void run() {
                this.f13541a.m3863I0();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ rx.c m3895a1() {
        u1j0 u1j0Var;
        C2089a c2089a = this.f2154I;
        if (c2089a == null || (u1j0Var = c2089a.f2116F) == null) {
            return null;
        }
        return u1j0Var.m14708c();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m3896c0() {
        this.f2146A.m4029G1(false);
        this.f2146A.m4069z0();
        m3872O1(false);
    }

    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void m3908i1(C2089a c2089a) {
        this.f2154I = c2089a;
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m3898d1(String str) {
        if (NullChecker.a(this.f2154I)) {
            this.f2154I.m3780a1(str);
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m3899e0() {
        return (nkg.m12258p0() && NullChecker.a(this.f2160O) && this.f2160O.m10019o()) ? false : true;
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m3900e1(TopicMoment topicMoment) {
        if (NullChecker.a(this.f2154I)) {
            this.f2154I.m3768U0(topicMoment, false);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m3901f0(ArrayList<Media> arrayList) {
        if (vwb.J(arrayList)) {
            return;
        }
        Iterator<Media> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().isFromShoot()) {
                m3933v0(0.0f, -1.0f);
                e51.H(act(), new Runnable() { // from class: l.w540
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f14405a.m3865J0();
                    }
                }, 500L);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m3902f1(String str, List list) {
        if (NullChecker.a(this.f2154I) && NullChecker.a(this.f2154I.f2116F)) {
            this.f2154I.f2116F.m14710e(str, list);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m3903g0() {
        if (!this.f2146A.m4045R0() || this.f2154I.m3784g1().size() <= 0) {
            return;
        }
        this.f2151F.postDelayed(new Runnable() { // from class: l.y440
            @Override // java.lang.Runnable
            public final void run() {
                this.f15247a.m3914l1();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m3904g1(String str) {
        this.f2175g.getText().insert(Selection.getSelectionEnd(this.f2175g.getText()), orh.m12749e(str));
    }

    /* JADX INFO: renamed from: h0 */
    public void m3905h0() {
        if (this.f2151F.isFinishing() || this.f2151F.isDestroyed()) {
            return;
        }
        if (!TextUtils.isEmpty(this.f2154I.f2127i)) {
            this.f2163R = true;
            this.f2175g.setText(this.f2154I.f2127i);
        }
        C2089a c2089a = this.f2154I;
        c2089a.m3770V0(c2089a.m3784g1());
        this.f2154I.m3787j1();
        this.f2175g.setMaxLength(this.f2158M);
        this.f2175g.h().subscribe(mkd0.G(new e30() { // from class: l.z440
            public final void call(Object obj) {
                this.f15581a.m3867K0((CharSequence) obj);
            }
        }));
        this.f2146A.m4032I0();
        this.f2152G = new od80(this.f2151F, this, false, this);
        this.f2153H = new GridLayoutManager(this.f2151F, 3);
        this.f2178j.addItemDecoration(new b());
        this.f2178j.setLayoutManager(this.f2153H);
        this.f2178j.setAdapter(this.f2152G);
        this.f2178j.setNestedScrollingEnabled(false);
        this.f2153H.scrollToPosition(this.f2152G.getItemCount() - 1);
        m3829b0();
        m3901f0(this.f2154I.m3784g1());
        m3941z1(this.f2154I.m3784g1());
        m3862H1(this.f2154I.f2126h);
        this.f2154I.m3789l1();
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m3906h1(View view) {
        C2089a c2089a = this.f2154I;
        NewPostAct newPostAct = this.f2151F;
        Objects.requireNonNull(newPostAct);
        r440 r440Var = new r440(newPostAct);
        String strM3915m0 = m3915m0();
        C2089a c2089a2 = this.f2154I;
        c2089a.m3769U1(r440Var, strM3915m0, c2089a2.f2134p, c2089a2.f2123e);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m3907i0() {
        this.f2154I.f2134p = null;
        this.f2179k.setVisibility(8);
        wng.m15855v().m15891j0();
        m3866J1();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM3890Z = m3890Z(layoutInflater, viewGroup);
        xzi0 xzi0Var = new xzi0(this.f2154I.f2123e, act(), this.f2154I);
        this.f2150E = xzi0Var;
        xzi0Var.m9087t(this.f2183o);
        if (!TextUtils.isEmpty(this.f2154I.f2129k)) {
            this.f2175g.setHint(this.f2154I.f2129k);
        }
        this.f2175g.setTypeface(null, 1);
        vwb.z(vwb.f0(new View[]{this.f2185q, this.f2186r, this.f2189u, this.f2190v}), new e30() { // from class: l.x540
            public final void call(Object obj) {
                this.f14771a.m3813M0((View) obj);
            }
        });
        m3925r0().setMaxWidth(t100.d(283.0f));
        xdl0.M(m3921p0(), false);
        xdl0.E0(m3921p0(), new View.OnClickListener() { // from class: l.z540
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15593a.m3870N0(view);
            }
        });
        this.f2146A.m4042O0(this.f2151F, this.f2154I);
        this.f2146A.setFeedPostAudioFinishListener(new FeedPostBottomView.InterfaceC2100d() { // from class: l.a640
            @Override // com.p000p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView.InterfaceC2100d
            /* JADX INFO: renamed from: a */
            public final void mo4072a(Audio audio) {
                this.f5588a.m3926r1(audio);
            }
        });
        this.f2146A.setFeedPostLocationListener(new FeedPostBottomView.InterfaceC2101e() { // from class: l.b640
            @Override // com.p000p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView.InterfaceC2101e
            /* JADX INFO: renamed from: a */
            public final void mo4073a() {
                this.f6114a.m3922p1();
            }
        });
        this.f2146A.setFeedPostAtListener(new FeedPostBottomView.InterfaceC2099c() { // from class: l.c640
            @Override // com.p000p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView.InterfaceC2099c
            /* JADX INFO: renamed from: a */
            public final void mo4071a() {
                this.f6545a.m3871O0();
            }
        });
        this.f2146A.setHideInputEditFieldAction(new d30() { // from class: l.s440
            public final void call() {
                this.f12789a.m3935w0();
            }
        });
        if (nkg.m12220R()) {
            this.f2146A.setIMomentVisibleChangedListener(new FeedPostBottomView.InterfaceC2102f() { // from class: l.t440
                @Override // com.p000p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView.InterfaceC2102f
                /* JADX INFO: renamed from: a */
                public final void mo4074a(String str) {
                    this.f13186a.m3873P0(str);
                }
            });
            this.f2193y.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.u440
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    zvf0.u("e_allow_forwarding", "p_moment_post", new j760[]{new j760("selection_situation", Integer.valueOf(z ? 1 : 0))});
                }
            });
        }
        this.f2146A.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.v440
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.f14060a.m3875Q0(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        m3856E0();
        this.f2175g.addTextChangedListener(m3913l0());
        this.f2175g.setOnKeyEventListener(new View.OnKeyListener() { // from class: l.w440
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return this.f14397a.m3877R0(view, i, keyEvent);
            }
        });
        this.f2175g.setEditableFactory(new rih(new hyh(FeedHighlightSpan.class), new hyh(FeedTitleTagsSpan.class)));
        m3940z0();
        if (NullChecker.a(this.f2154I.f2111A) && !vwb.J(this.f2154I.f2111A.titles)) {
            eqg eqgVar = new eqg(this.f2175g, this.f2154I.f2111A.titles);
            this.f2167V = eqgVar;
            this.f2146A.m4022A1(this.f2154I.f2111A.titles, eqgVar);
        }
        return act().setUpKeyboardDetectorLayout(viewM3890Z, new View(act()), new f30() { // from class: l.y540
            public final void call(Object obj, Object obj2) {
                this.f15259a.m3852B1((Boolean) obj, (Integer) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public void m3909j0() {
        if (NullChecker.a(this.f2156K)) {
            d.l().k(this.f2156K);
            this.f2156K = null;
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m3910j1(View view) {
        C2089a c2089a = this.f2154I;
        NewPostAct newPostAct = this.f2151F;
        Objects.requireNonNull(newPostAct);
        c2089a.m3761Q0(new r440(newPostAct));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m3911k0() {
        if (m3924q1()) {
            m3905h0();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m3912k1(String str) {
        if (this.f2154I.m3755L1(str, this.f2155J)) {
            this.f2151F.finish();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final TextWatcher m3913l0() {
        return new a();
    }

    /* JADX INFO: renamed from: m0 */
    public final String m3915m0() {
        return NullChecker.a(this.f2167V) ? this.f2167V.m9947b(this.f2175g.getText()) : this.f2175g.getText().toString();
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m3916m1() {
        this.f2146A.f2246l.setSelected(false);
    }

    /* JADX INFO: renamed from: n0 */
    public final String m3917n0() {
        Editable text = this.f2175g.getText();
        if (NullChecker.a(this.f2167V)) {
            text = this.f2167V.m9956k(text);
        }
        String strTrim = text.toString().trim();
        if (nkg.m12273x() && !vwb.J(this.f2154I.f2117G)) {
            Iterator<String> it = this.f2154I.f2117G.iterator();
            while (it.hasNext()) {
                strTrim = this.f2175g.getText().toString().trim().replace(it.next(), "");
            }
        }
        return strTrim;
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m3918n1(boolean z, NotifyUsers notifyUsers) {
        if (NullChecker.a(notifyUsers)) {
            this.f2154I.m3757O0(notifyUsers, z);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m3919o0() {
        ArrayList<Media> arrayListM3784g1 = this.f2154I.m3784g1();
        if (!this.f2154I.m3792o1(arrayListM3784g1)) {
            arrayListM3784g1 = new ArrayList<>();
        }
        if (this.f2194z.getVisibility() == 8) {
            return ((arrayListM3784g1 == null || arrayListM3784g1.size() == 0) && TextUtils.isEmpty(m3917n0()) && this.f2154I.m3753I1()) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m3920o1() {
        if (this.f2146A.m4028E1()) {
            return;
        }
        nlg.m12287g().m12291e(act());
    }

    /* JADX INFO: renamed from: p0 */
    public final VImage m3921p0() {
        return u2h.m14723h() ? this.f2191w : this.f2187s;
    }

    /* JADX INFO: renamed from: p1 */
    public final void m3922p1() {
        PutongAct putongAct = this.f2151F;
        putongAct.startActivityForResult(NewPostLocationAct.m3709X1(putongAct, "p_moment_post", this.f2154I.f2140v), 10020);
        this.f2151F.overridePendingTransition(uzb0.f13995i, 0);
    }

    /* JADX INFO: renamed from: q0 */
    public final VLinear m3923q0() {
        return u2h.m14723h() ? this.f2188t : this.f2184p;
    }

    /* JADX INFO: renamed from: q1 */
    public final boolean m3924q1() {
        return this.f2152G == null;
    }

    /* JADX INFO: renamed from: r0 */
    public final VText m3925r0() {
        return u2h.m14723h() ? this.f2190v : this.f2186r;
    }

    /* JADX INFO: renamed from: r1 */
    public final void m3926r1(Audio audio) {
        m3882T1(audio);
        m3914l1();
    }

    /* JADX INFO: renamed from: s0 */
    public int m3927s0() {
        return this.f2146A.getSelectedPosition();
    }

    /* JADX INFO: renamed from: s1 */
    public void m3928s1() {
        ArrayList<Media> arrayListM3784g1 = this.f2154I.m3784g1();
        if (!this.f2154I.m3792o1(arrayListM3784g1)) {
            arrayListM3784g1 = new ArrayList<>();
        }
        if (this.f2146A.m4026D0()) {
            return;
        }
        if (m3917n0().isEmpty() && ((arrayListM3784g1 == null || arrayListM3784g1.size() == 0) && this.f2154I.m3753I1())) {
            if ("share".equals(act().f2081c) || "from_h5_moment_level_open_camera".equals(act().f2081c)) {
                this.f2151F.m3694e2();
                return;
            }
            C2089a c2089a = this.f2154I;
            NewPostAct newPostAct = this.f2151F;
            Objects.requireNonNull(newPostAct);
            c2089a.m3761Q0(new r440(newPostAct));
            return;
        }
        if ((TextUtils.isEmpty(m3917n0()) && ((!NullChecker.b(arrayListM3784g1) || arrayListM3784g1.size() == 0 || (TextUtils.isEmpty(arrayListM3784g1.get(0).originUrl) && TextUtils.isEmpty(arrayListM3784g1.get(0).url))) && this.f2154I.m3753I1())) || this.f2154I.f2125g || TextUtils.equals("immersion_cartoon_effects", act().f2081c) || TextUtils.equals("immersion", act().f2081c) || "share".equals(act().f2081c) || "from_h5_moment_level_open_camera".equals(act().f2081c)) {
            this.f2151F.m3694e2();
        } else {
            wng.m15855v().m15891j0();
            new xh0.a(this.f2151F).i(R$string.f378J1).q(R$string.f468Y1).o(new View.OnClickListener() { // from class: l.c540
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6538a.m3906h1(view);
                }
            }).e(R$string.f604s1).c(new View.OnClickListener() { // from class: l.n540
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10664a.m3910j1(view);
                }
            }).a().g();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public List<TopicMoment> m3929t0() {
        return this.f2146A.getTopicList();
    }

    /* JADX INFO: renamed from: t1 */
    public boolean m3930t1() {
        if (this.f2154I.f2115E) {
            return false;
        }
        Editable text = this.f2175g.getText();
        eqg eqgVar = this.f2167V;
        if (eqgVar != null) {
            text = eqgVar.m9956k(text);
        }
        final String string = text.toString();
        boolean zIsEmpty = TextUtils.isEmpty(string);
        C2089a c2089a = this.f2154I;
        if (zIsEmpty) {
            return c2089a.m3755L1(string, this.f2155J);
        }
        c2089a.m3776Y0(string, new d30() { // from class: l.v540
            public final void call() {
                this.f14064a.m3912k1(string);
            }
        });
        return false;
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m3931u0() {
        return PermissionHelper.b(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: u1 */
    public void m3932u1(NewMomentDraft newMomentDraft) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(newMomentDraft.text)) {
            this.f2163R = true;
            if (NullChecker.a(this.f2167V)) {
                spannableStringBuilder.append((CharSequence) this.f2167V.m9955j(newMomentDraft.text));
            } else {
                spannableStringBuilder.append((CharSequence) eqg.m9946a(newMomentDraft.text));
            }
            this.f2175g.setText(spannableStringBuilder);
            this.f2175g.setSelection(Math.min(spannableStringBuilder.length(), this.f2158M));
        }
        if (!m3931u0() && !vwb.J(newMomentDraft.images)) {
            for (Media media : newMomentDraft.images) {
                if (!TextUtils.isEmpty(media.originUrl) && !media.originUrl.contains("com.p1.mobile.putong/cache/.tantan") && !media.originUrl.contains("com.p1.mobile.putong/files/moment")) {
                    return;
                }
            }
        }
        m3857E1(newMomentDraft);
        if (newMomentDraft.images.size() > 0) {
            m3938y0(false);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m3933v0(float f, float f2) {
        this.f2146A.m4030H0(f2, m3861H0(f, f2));
    }

    /* JADX INFO: renamed from: v1 */
    public void m3934v1() {
        if (m3924q1() && this.f2157L) {
            m3905h0();
        }
        this.f2157L = false;
        if (NullChecker.a(this.f2159N)) {
            m3857E1(this.f2159N);
            this.f2159N = null;
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m3935w0() {
        if (NullChecker.b(this.f2175g)) {
            this.f2175g.clearFocus();
            this.f2151F.hideInput(this.f2175g);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public void m3936w1(String str, List<TopicMoment> list) {
        if (nkg.m12258p0() && NullChecker.a(this.f2154I) && NullChecker.a(this.f2154I.f2123e)) {
            for (final TopicMoment topicMoment : list) {
                topicMoment.selected = vwb.m(this.f2154I.f2123e, new w9j() { // from class: l.o540
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((TopicMoment) obj).f708id.equals(topicMoment.f708id));
                    }
                });
            }
        }
        this.f2146A.m4059p1(str, list);
    }

    /* JADX INFO: renamed from: x0 */
    public void m3937x0() {
        m3938y0(m3931u0());
    }

    /* JADX INFO: renamed from: y0 */
    public final void m3938y0(boolean z) {
        this.f2146A.m4040M1(Integer.valueOf(this.f2149D));
        this.f2146A.m4029G1(z);
        if (z) {
            return;
        }
        e51.H(act(), new Runnable() { // from class: l.p540
            @Override // java.lang.Runnable
            public final void run() {
                this.f11697a.m3879S0();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: y1 */
    public void m3939y1(List<TopicMoment> list) {
        m3936w1("", list);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m3940z0() {
        if (this.f2151F.getIntent().getBooleanExtra("extra_show_audio_input", false)) {
            this.f2146A.m4055k1(false);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public void m3941z1(ArrayList<Media> arrayList) {
        this.f2146A.m4060q1(arrayList);
    }
}
