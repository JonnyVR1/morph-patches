package com.p051p1.mobile.putong.feed.newui.mediapicker.post;

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
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaMeta;
import com.p051p1.mobile.putong.data.MessageLocation;
import com.p051p1.mobile.putong.data.TopicMomentIdBox;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.MomentShareInfoParcelable;
import com.p051p1.mobile.putong.feed.data.NewMomentDraft;
import com.p051p1.mobile.putong.feed.data.NotifyUsers;
import com.p051p1.mobile.putong.feed.data.TopicCategorie;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewCaptionMediaView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.span.FeedTitleTagsSpan;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.state.FeedMomentPostStatusView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.view.FeedPostMediaRecyclerView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedSharelinkView;
import com.p051p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.apmem.tools.layouts.FlowLayout;
import p137rx.C22421c;
import p151v.VCheckBox;
import p151v.VImage;
import p151v.VLinear;
import p151v.VScroll;
import p151v.VText;
import p153l.a8c0;
import p153l.ath;
import p153l.b9j0;
import p153l.bnl0;
import p153l.c4h;
import p153l.cmg;
import p153l.cng;
import p153l.d8j0;
import p153l.dth;
import p153l.fd40;
import p153l.fgc0;
import p153l.gkh;
import p153l.i4g0;
import p153l.iam;
import p153l.iog;
import p153l.j4h;
import p153l.jbj0;
import p153l.jxd0;
import p153l.jyb;
import p153l.k9c0;
import p153l.ksg;
import p153l.l51;
import p153l.lbc0;
import p153l.lpg;
import p153l.mu4;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.r4h;
import p153l.te40;
import p153l.tfj0;
import p153l.th0;
import p153l.trg;
import p153l.uqb0;
import p153l.wpe;
import p153l.wzh;
import p153l.x20;
import p153l.xl80;
import p153l.y0m;
import p153l.y20;
import p153l.yaj0;
import p153l.z20;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.b */
/* JADX INFO: loaded from: classes13.dex */
public class C11409b implements iam<C11408a>, y0m {

    /* JADX INFO: renamed from: X */
    public static int f41532X = qa00.m175859d(290.0f);

    /* JADX INFO: renamed from: A */
    public FeedPostBottomView f41533A;

    /* JADX INFO: renamed from: B */
    public FrameLayout f41534B;

    /* JADX INFO: renamed from: C */
    public FrameLayout f41535C;

    /* JADX INFO: renamed from: E */
    public r4h<TopicMoment> f41537E;

    /* JADX INFO: renamed from: F */
    public NewPostAct f41538F;

    /* JADX INFO: renamed from: G */
    public xl80 f41539G;

    /* JADX INFO: renamed from: H */
    public LinearLayoutManager f41540H;

    /* JADX INFO: renamed from: I */
    public C11408a f41541I;

    /* JADX INFO: renamed from: J */
    public MessageLocation f41542J;

    /* JADX INFO: renamed from: K */
    public String f41543K;

    /* JADX INFO: renamed from: L */
    public boolean f41544L;

    /* JADX INFO: renamed from: N */
    public NewMomentDraft f41546N;

    /* JADX INFO: renamed from: O */
    public jbj0 f41547O;

    /* JADX INFO: renamed from: P */
    public d8j0 f41548P;

    /* JADX INFO: renamed from: Q */
    public boolean f41549Q;

    /* JADX INFO: renamed from: R */
    public boolean f41550R;

    /* JADX INFO: renamed from: S */
    public ath f41551S;

    /* JADX INFO: renamed from: T */
    public mu4 f41552T;

    /* JADX INFO: renamed from: U */
    public iog f41553U;

    /* JADX INFO: renamed from: V */
    public trg f41554V;

    /* JADX INFO: renamed from: a */
    public VLinear f41556a;

    /* JADX INFO: renamed from: b */
    public VImage f41557b;

    /* JADX INFO: renamed from: c */
    public FeedMomentPostStatusView f41558c;

    /* JADX INFO: renamed from: d */
    public TextView f41559d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f41560e;

    /* JADX INFO: renamed from: f */
    public VScroll f41561f;

    /* JADX INFO: renamed from: g */
    public FeedEditText f41562g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f41563h;

    /* JADX INFO: renamed from: i */
    public View f41564i;

    /* JADX INFO: renamed from: j */
    public FeedPostMediaRecyclerView f41565j;

    /* JADX INFO: renamed from: k */
    public RelativeLayout f41566k;

    /* JADX INFO: renamed from: l */
    public FeedAudioPlayerView f41567l;

    /* JADX INFO: renamed from: m */
    public VImage f41568m;

    /* JADX INFO: renamed from: n */
    public FeedSharelinkView f41569n;

    /* JADX INFO: renamed from: o */
    public FlowLayout f41570o;

    /* JADX INFO: renamed from: p */
    public VLinear f41571p;

    /* JADX INFO: renamed from: q */
    public VImage f41572q;

    /* JADX INFO: renamed from: r */
    public VText f41573r;

    /* JADX INFO: renamed from: s */
    public VImage f41574s;

    /* JADX INFO: renamed from: t */
    public VLinear f41575t;

    /* JADX INFO: renamed from: u */
    public VImage f41576u;

    /* JADX INFO: renamed from: v */
    public VText f41577v;

    /* JADX INFO: renamed from: w */
    public VImage f41578w;

    /* JADX INFO: renamed from: x */
    public RelativeLayout f41579x;

    /* JADX INFO: renamed from: y */
    public VCheckBox f41580y;

    /* JADX INFO: renamed from: z */
    public VText f41581z;

    /* JADX INFO: renamed from: D */
    public int f41536D = f41532X;

    /* JADX INFO: renamed from: M */
    public int f41545M = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;

    /* JADX INFO: renamed from: W */
    public jxd0 f41555W = new jxd0("has_show_post_moment_long_click_tip" + uqb0.f180396b0.f170324a.userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.b$a */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (cmg.m111243x() && NullChecker.m82486a(C11409b.this.f41553U)) {
                C11409b.this.f41553U.m141298b(editable, C11409b.this.f41541I.f41505H, C11409b.this.f41541I.f41504G);
                if (!jyb.m147479J(C11409b.this.f41541I.f41505H)) {
                    for (NotifyUsers notifyUsers : C11409b.this.f41541I.f41505H) {
                        final TopicMoment topicMomentNew_ = TopicMoment.new_();
                        TopicMomentIdBox topicMomentIdBox = notifyUsers.topic;
                        topicMomentNew_.f40095id = topicMomentIdBox.f39672id;
                        topicMomentNew_.name = topicMomentIdBox.name;
                        if (!jyb.m147520m(C11409b.this.f41541I.f41510e, new qcj() { // from class: l.re40
                            @Override // p153l.qcj
                            public final Object call(Object obj) {
                                return Boolean.valueOf(TextUtils.equals(((TopicMoment) obj).f40095id, topicMomentNew_.f40095id));
                            }
                        }) && C11409b.this.f41541I.f41510e.size() < 3) {
                            C11409b.this.f41541I.f41510e.add(topicMomentNew_);
                            C11409b.this.f41541I.m63943S1(C11409b.this.f41541I.f41510e);
                        }
                    }
                }
            }
            bnl0.m105524M(C11409b.this.f41581z, false);
            C11409b.this.m64041J1();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m64118c() {
            C11409b.this.m64047O1(true);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2;
            int i4;
            int i5;
            int i6;
            if (!NullChecker.m82486a(C11409b.this.f41548P) || C11409b.this.f41550R) {
                charSequence2 = charSequence;
                i4 = i;
                i5 = i2;
                i6 = i3;
                C11409b.this.f41550R = false;
            } else {
                C11409b.this.f41550R = false;
                charSequence2 = charSequence;
                i4 = i;
                i5 = i2;
                i6 = i3;
                C11409b.this.f41548P.m114847k(C11409b.this.f41562g, charSequence2, i4, i5, i6);
            }
            if (NullChecker.m82486a(C11409b.this.f41553U)) {
                int i7 = i5;
                int i8 = i6;
                C11409b.this.f41553U.m141302f(C11409b.this.f41562g, charSequence2, i4, i7, i8, new x20() { // from class: l.se40
                    @Override // p153l.x20
                    public final void call() {
                        this.f167486a.m64118c();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.b$b */
    public class b extends RecyclerView.AbstractC0578n {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
            rect.left = 0;
            rect.right = qa00.m175859d(NewCaptionMediaView.f41317f);
            rect.top = qa00.m175859d(NewCaptionMediaView.f41317f);
            rect.bottom = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.b$c */
    public class c extends C0607k.e {

        /* JADX INFO: renamed from: d */
        public boolean f41584d;

        /* JADX INFO: renamed from: e */
        public RecyclerView.AbstractC0569e0 f41585e;

        public c() {
        }

        @Override // androidx.recyclerview.widget.C0607k.e
        /* JADX INFO: renamed from: A */
        public void mo3773A(@Nullable RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
            super.mo3773A(abstractC0569e0, i);
            int childCount = C11409b.this.f41565j.getLayoutManager().getChildCount();
            if (i != 0) {
                if (this.f41585e == null) {
                    this.f41585e = abstractC0569e0;
                }
                C11409b.this.m64067Z1(this.f41585e, childCount, false);
            } else {
                C11409b.this.m64067Z1(this.f41585e, childCount, true);
                this.f41585e = null;
            }
            if (this.f41584d) {
                C11409b.this.f41533A.m64225o1(false);
            }
        }

        @Override // androidx.recyclerview.widget.C0607k.e
        /* JADX INFO: renamed from: B */
        public void mo3774B(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        }

        @Override // androidx.recyclerview.widget.C0607k.e
        /* JADX INFO: renamed from: k */
        public int mo3784k(RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0) {
            int itemViewType = abstractC0569e0.getItemViewType();
            xl80 unused = C11409b.this.f41539G;
            if (itemViewType != 0) {
                return 0;
            }
            return C0607k.e.m3772t(15, 0);
        }

        @Override // androidx.recyclerview.widget.C0607k.e
        /* JADX INFO: renamed from: y */
        public boolean mo3796y(RecyclerView recyclerView, RecyclerView.AbstractC0569e0 abstractC0569e0, RecyclerView.AbstractC0569e0 abstractC0569e1) {
            int adapterPosition = abstractC0569e0.getAdapterPosition();
            int adapterPosition2 = abstractC0569e1.getAdapterPosition();
            ArrayList<Media> arrayListM63960g1 = C11409b.this.f41541I.m63960g1();
            if (adapterPosition2 != arrayListM63960g1.size() && adapterPosition != arrayListM63960g1.size()) {
                if (adapterPosition < adapterPosition2) {
                    int i = adapterPosition;
                    while (i < adapterPosition2) {
                        int i2 = i + 1;
                        if (i2 >= arrayListM63960g1.size()) {
                            break;
                        }
                        Collections.swap(arrayListM63960g1, i, i2);
                        i = i2;
                    }
                } else {
                    for (int i3 = adapterPosition; i3 > adapterPosition2 && i3 > 0; i3--) {
                        Collections.swap(arrayListM63960g1, i3, i3 - 1);
                    }
                }
                this.f41584d = true;
                C11409b.this.f41533A.setSelectedImages(arrayListM63960g1);
                C11409b.this.f41539G.notifyItemMoved(adapterPosition, adapterPosition2);
            }
            return true;
        }
    }

    public C11409b(NewPostAct newPostAct) {
        this.f41538F = newPostAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m63986L0(View view) {
        i4g0.m138523u("e_poi_tag", "p_moment_post", jyb.m147494Y("poitagshow", Integer.valueOf(this.f41541I.f41528w ? 1 : 0)));
        m64096p1();
    }

    /* JADX INFO: renamed from: L1 */
    private void m63987L1(Integer num) {
        if (num.intValue() != 0 && this.f41536D != num.intValue()) {
            this.f41536D = num.intValue();
        }
        this.f41533A.setAlbumHeight(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public /* synthetic */ void m63989M0(View view) {
        if (NullChecker.m82486a(view)) {
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.ld40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f131413a.m63986L0(view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m63998U0(View view) {
        this.f41538F.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m64000V0(View view) {
        this.f41538F.m63870d2();
    }

    /* JADX INFO: renamed from: b0 */
    private void m64005b0() {
        new C0607k(new c()).m3751g(this.f41565j);
    }

    /* JADX INFO: renamed from: A0 */
    public void m64025A0() {
        int iIntValue = Act.savedKeyboardHeight.get().intValue();
        if (iIntValue == 0 || iIntValue == qa00.m175859d(220.0f)) {
            return;
        }
        this.f41536D = iIntValue;
    }

    /* JADX INFO: renamed from: A1 */
    public void m64026A1(ArrayList<Media> arrayList) {
        if (arrayList.size() > 0) {
            Media media = arrayList.get(0);
            if (media instanceof Audio) {
                m64100r1((Audio) media);
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m64027B0() {
        this.f41538F.lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.ge40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103768a.m64056T0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B1 */
    public final void m64028B1(Boolean bool, Integer num) {
        this.f41549Q = bool.booleanValue();
        m63987L1(num);
        this.f41533A.m64230t1(bool);
        if (cmg.m111228p0() && NullChecker.m82486a(this.f41547O)) {
            boolean zBooleanValue = bool.booleanValue();
            jbj0 jbj0Var = this.f41547O;
            if (zBooleanValue) {
                jbj0Var.m144298G(num.intValue());
            } else {
                jbj0Var.m144305m();
            }
        }
        if (cmg.m111243x() && NullChecker.m82486a(this.f41552T)) {
            boolean zBooleanValue2 = bool.booleanValue();
            mu4 mu4Var = this.f41552T;
            if (zBooleanValue2) {
                mu4Var.m160093r(num.intValue());
            } else {
                mu4Var.m160083h();
            }
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f41538F;
    }

    /* JADX INFO: renamed from: C1 */
    public void m64029C1(boolean z) {
        this.f41533A.m64231u1(z);
    }

    /* JADX INFO: renamed from: D0 */
    public void m64030D0(Bundle bundle) {
        m64085k0();
        m64051Q1();
        m64035G1();
        if (j4h.m143424h()) {
            this.f41557b.setImageResource(lbc0.f130874J3);
            Drawable drawable = this.f41538F.getResources().getDrawable(lbc0.f130910O3);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            this.f41559d.setCompoundDrawables(null, null, drawable, null);
            this.f41559d.setCompoundDrawablePadding(qa00.m175859d(2.0f));
            wpe.m207454a(this.f41562g);
            this.f41562g.setHintTextColor(this.f41538F.getResources().getColor(k9c0.f124509h));
            this.f41562g.setTextColor(this.f41538F.getResources().getColor(k9c0.f124507g));
        }
        bnl0.m105509E0(this.f41557b, new View.OnClickListener() { // from class: l.od40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146846a.m63998U0(view);
            }
        });
        this.f41559d.setClickable(false);
        bnl0.m105509E0(this.f41559d, new View.OnClickListener() { // from class: l.pd40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151705a.m64000V0(view);
            }
        });
        if (cmg.m111238u0()) {
            bnl0.m105524M(this.f41558c, true);
            this.f41558c.m64246R(this.f41538F);
            this.f41541I.m63958d1();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m64031E0() {
        if (ksg.m151217m0()) {
            m64027B0();
            this.f41533A.m64203K0(new x20() { // from class: l.sd40
                @Override // p153l.x20
                public final void call() {
                    this.f167376a.m64060W0();
                }
            });
            this.f41568m.setOnClickListener(new View.OnClickListener() { // from class: l.td40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f173307a.m64061X0(view);
                }
            });
        }
        if (cmg.m111228p0()) {
            this.f41547O = new jbj0(this.f41538F, this.f41534B);
            this.f41533A.f41626e.setAddTopicClickHooker(new x20() { // from class: l.ud40
                @Override // p153l.x20
                public final void call() {
                    this.f178505a.m64063Y0();
                }
            });
            this.f41547O.m144293B(new x20() { // from class: l.vd40
                @Override // p153l.x20
                public final void call() {
                    this.f183538a.m64066Z0();
                }
            });
            this.f41547O.m144292A(new pcj() { // from class: l.wd40
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f188528a.m64070a1();
                }
            });
            this.f41547O.m144294C(new y20() { // from class: l.xd40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f193512a.m64073d1((String) obj);
                }
            });
            this.f41547O.m144296E(new y20() { // from class: l.yd40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f198571a.m64075e1((TopicMoment) obj);
                }
            });
            this.f41547O.m144295D(new z20() { // from class: l.zd40
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f203856a.m64077f1((String) obj, (List) obj2);
                }
            });
            this.f41548P = new d8j0(this.f41541I, this.f41547O);
        }
        if (cmg.m111243x()) {
            mu4 mu4Var = new mu4(this.f41538F, this.f41535C);
            this.f41552T = mu4Var;
            mu4Var.m160091p(new y20() { // from class: l.ae40
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f70764a.m64079g1((String) obj);
                }
            });
            this.f41553U = new iog(this.f41552T);
        }
    }

    /* JADX INFO: renamed from: E1 */
    public final void m64032E1(NewMomentDraft newMomentDraft) {
        ArrayList<Media> arrayList = (ArrayList) newMomentDraft.images;
        if (!jyb.m147479J(arrayList) && (arrayList.get(0) instanceof Audio)) {
            m64107v0(0.0f, -1.0f);
            l51.m152888H(getAct(), new Runnable() { // from class: l.rd40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f162284a.m64088l1();
                }
            }, 500L);
        }
        m64115z1(arrayList);
        this.f41541I.f41509d.onNext((ArrayList) newMomentDraft.images);
    }

    /* JADX INFO: renamed from: F1 */
    public void m64033F1(ArrayList<Media> arrayList) {
        if (!this.f41541I.m63968o1(arrayList)) {
            arrayList = new ArrayList<>();
        }
        if (NullChecker.m82486a(this.f41539G)) {
            this.f41539G.m211547H(arrayList);
            if (!this.f41555W.get().booleanValue() && NullChecker.m82486a(arrayList) && arrayList.size() >= 2) {
                this.f41555W.put(Boolean.TRUE);
                m64058U1();
            }
            if (arrayList == null || arrayList.size() < 2) {
                m64083j0();
            }
            if (cmg.m111190R() && !jyb.m147479J(arrayList) && (arrayList.get(0) instanceof Video)) {
                m64049P1(true);
            } else {
                m64049P1(false);
            }
            if (jyb.m147479J(arrayList) || !(arrayList.get(0) instanceof Video)) {
                bnl0.m105537U(this.f41565j, qa00.m175859d(13.0f));
            } else {
                bnl0.m105537U(this.f41565j, qa00.f156326m);
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m64034G0(float f, float f2) {
        int[] iArr = new int[2];
        this.f41562g.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return f >= ((float) i) && f <= ((float) (i + this.f41562g.getWidth())) && f2 >= ((float) i2) && f2 <= ((float) (i2 + this.f41562g.getHeight()));
    }

    /* JADX INFO: renamed from: G1 */
    public void m64035G1() {
        MomentShareInfoParcelable momentShareInfoParcelable = this.f41541I.f41522q;
        FeedSharelinkView feedSharelinkView = this.f41569n;
        if (momentShareInfoParcelable == null) {
            bnl0.m105524M(feedSharelinkView, false);
            return;
        }
        bnl0.m105524M(feedSharelinkView, true);
        this.f41569n.m66415e(this.f41541I.f41522q, "p_moment_post");
        this.f41569n.setCanClick(false);
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m64036H0(float f, float f2) {
        return f2 > 0.0f && !m64034G0(f, f2);
    }

    /* JADX INFO: renamed from: H1 */
    public void m64037H1(String str) {
        this.f41533A.m64235y1(str);
    }

    /* JADX INFO: renamed from: I1 */
    public void m64039I1(ArrayList<TopicMoment> arrayList) {
        this.f41533A.m64237z1();
        if (!NullChecker.m82486a(arrayList) || arrayList.size() <= 0) {
            bnl0.m105524M(this.f41570o, false);
        } else {
            bnl0.m105524M(this.f41570o, true);
        }
        ((b9j0) this.f41537E).m103107E(arrayList);
    }

    /* JADX INFO: renamed from: J1 */
    public void m64041J1() {
        boolean zM64093o0 = m64093o0();
        this.f41559d.setClickable(zM64093o0);
        this.f41538F.m63866Z1(zM64093o0, this.f41559d);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m64042K0(CharSequence charSequence) {
        m64041J1();
    }

    /* JADX INFO: renamed from: K1 */
    public void m64043K1(pf60<List<TopicCategorie>, List<TopicMoment>> pf60Var) {
        this.f41533A.m64191B1(pf60Var);
    }

    /* JADX INFO: renamed from: M1 */
    public final void m64044M1(Media media) {
        if (NullChecker.m82486a(media.meta)) {
            return;
        }
        MediaMeta mediaMetaNew_ = MediaMeta.new_();
        media.meta = mediaMetaNew_;
        mediaMetaNew_.type = "voice";
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m64045N0(View view) {
        this.f41542J = null;
        m64099r0().setText((CharSequence) null);
        m64097q0().setVisibility(8);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m64046O0() {
        tfj0.m190940c("e_moment_at", "p_moment_post", new pf60[0]);
        m64071c0();
    }

    /* JADX INFO: renamed from: O1 */
    public final void m64047O1(final boolean z) {
        if (this.f41551S == null) {
            this.f41551S = new ath(this.f41538F, fgc0.f98902e, new x20() { // from class: l.ee40
                @Override // p153l.x20
                public final void call() {
                    this.f93618a.m64090m1();
                }
            }).m100191t(false);
        }
        this.f41551S.m100194z(dth.m117872c());
        this.f41551S.m100190A(new y20() { // from class: l.fe40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f98567a.m64092n1(z, (NotifyUsers) obj);
            }
        });
        this.f41551S.show();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m64048P0(String str) {
        if (TextUtils.equals(str, "everyone")) {
            m64049P1(true);
        } else {
            m64049P1(false);
        }
    }

    /* JADX INFO: renamed from: P1 */
    public void m64049P1(boolean z) {
        if (bnl0.m105529O0(this.f41579x) && z) {
            return;
        }
        if (z) {
            i4g0.m138492A("e_allow_forwarding", "p_moment_post", new pf60("selection_situation", 1));
        }
        bnl0.m105524M(this.f41579x, z);
        this.f41580y.setChecked(z);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m64050Q0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f41561f.getLayoutParams();
        layoutParams.bottomMargin = this.f41560e.getHeight() - i2;
        this.f41561f.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m64051Q1() {
        l51.m152888H(getAct(), new Runnable() { // from class: l.he40
            @Override // java.lang.Runnable
            public final void run() {
                this.f109063a.m64094o1();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ boolean m64052R0(View view, int i, KeyEvent keyEvent) {
        if (i != 67 || keyEvent.getAction() != 0) {
            return false;
        }
        if (NullChecker.m82486a(this.f41553U)) {
            this.f41553U.m141301e(this.f41562g.getText());
        }
        if (!NullChecker.m82486a(this.f41554V)) {
            return false;
        }
        this.f41554V.m192485e(this.f41562g.getText());
        return false;
    }

    /* JADX INFO: renamed from: R1 */
    public void m64053R1() {
        if (!NullChecker.m82486a(this.f41541I.f41520o)) {
            this.f41542J = null;
            m64099r0().setText((CharSequence) null);
            m64097q0().setVisibility(8);
            return;
        }
        MessageLocation messageLocation = new MessageLocation();
        this.f41542J = messageLocation;
        C11408a c11408a = this.f41541I;
        messageLocation.name = c11408a.f41518m;
        messageLocation.address = c11408a.f41519n;
        messageLocation.coordinates = c11408a.f41520o;
        m64099r0().setText(this.f41542J.name);
        m64097q0().setVisibility(0);
        i4g0.m138492A("e_poi_tag", "p_moment_post", jyb.m147494Y("poitagshow", Integer.valueOf(this.f41541I.f41528w ? 1 : 0)));
    }

    /* JADX INFO: renamed from: S1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m64088l1() {
        bnl0.m105500A(this.f41562g);
        getAct().showInput(this.f41562g, 0);
        this.f41562g.requestFocus();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m64056T0(C4470c c4470c) {
        if (c4470c == C4470c.f16268j) {
            this.f41533A.m64202J1();
        }
    }

    /* JADX INFO: renamed from: T1 */
    public final void m64057T1(Audio audio) {
        this.f41541I.m63960g1().clear();
        this.f41541I.f41521p = audio;
        this.f41566k.setVisibility(0);
        this.f41567l.m67462X0(audio.duration, audio.url);
        m64041J1();
        m64044M1(audio);
    }

    /* JADX INFO: renamed from: U1 */
    public final void m64058U1() {
        this.f41543K = C4499d.m21895l().m21907t(new C4496a(this.f41538F).m21848D(this.f41538F.getResources().getString(R$string.f39753H1)).m21872o(C4496a.f16400O, qa00.m175859d(8.0f)).m21874q(C4496a.f16402Q | C4496a.f16400O).m21860b(3000L), this.f41564i);
    }

    /* JADX INFO: renamed from: V1 */
    public void m64059V1(boolean z) {
        this.f41533A.m64204K1(z);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m64060W0() {
        if (NullChecker.m82486a(this.f41552T)) {
            this.f41552T.m160082g();
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m64061X0(View view) {
        m64082i0();
    }

    /* JADX INFO: renamed from: X1 */
    public boolean m64062X1() {
        return this.f41533A.m64206L1();
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m64063Y0() {
        i4g0.m138520r("e_create_topic", "p_moment_post");
        if (!this.f41549Q) {
            this.f41562g.requestFocus();
            this.f41538F.showInput(this.f41562g, 0);
        }
        int selectionStart = this.f41562g.getSelectionStart();
        Editable text = this.f41562g.getText();
        if (selectionStart <= 0 || !"#".equals(text.subSequence(selectionStart - 1, selectionStart).toString())) {
            c4h.m107883a(this.f41562g, "#");
            return;
        }
        this.f41548P.m114839c();
        this.f41547O.m144297F();
        this.f41547O.m144316x("");
    }

    /* JADX INFO: renamed from: Y1 */
    public void m64064Y1() {
        if (cmg.m111238u0()) {
            this.f41558c.m64249l0(this.f41541I.m63959e1());
        }
    }

    /* JADX INFO: renamed from: Z */
    public View m64065Z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return te40.m190682b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m64066Z0() {
        this.f41533A.f41626e.m64159G();
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m64067Z1(RecyclerView.AbstractC0569e0 abstractC0569e0, int i, boolean z) {
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = this.f41565j.getLayoutManager().getChildAt(i2);
            if (NullChecker.m82486a(abstractC0569e0) && childAt == abstractC0569e0.itemView) {
                ((NewCaptionMediaView) childAt).setImageDeleteVisible(z);
            } else {
                childAt.setScaleX(z ? 1.0f : 0.9f);
                childAt.setScaleY(z ? 1.0f : 0.9f);
            }
        }
    }

    @Override // p153l.y0m
    /* JADX INFO: renamed from: a */
    public void mo64068a() {
        this.f41541I.m63961h1(this.f41539G.m211546G());
    }

    /* JADX INFO: renamed from: a0 */
    public void m64069a0(String str, boolean z) {
        String string = this.f41562g.getText().toString();
        String strSubstring = (string.length() <= 0 || !z) ? "" : string.substring(string.length() - 1);
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.equals(strSubstring, "@") ? "" : "@");
        sb.append(str);
        this.f41562g.getText().insert(Selection.getSelectionEnd(this.f41562g.getText()), sb.toString());
        this.f41533A.m64207M1(Integer.valueOf(this.f41536D));
        l51.m152888H(getAct(), new Runnable() { // from class: l.ie40
            @Override // java.lang.Runnable
            public final void run() {
                this.f114552a.m64038I0();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ C22421c m64070a1() {
        yaj0 yaj0Var;
        C11408a c11408a = this.f41541I;
        if (c11408a == null || (yaj0Var = c11408a.f41503F) == null) {
            return null;
        }
        return yaj0Var.m214891c();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m64071c0() {
        this.f41533A.m64196G1(false);
        this.f41533A.m64236z0();
        m64047O1(false);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C11408a c11408a) {
        this.f41541I = c11408a;
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m64073d1(String str) {
        if (NullChecker.m82486a(this.f41541I)) {
            this.f41541I.m63956a1(str);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m64074e0() {
        return (cmg.m111228p0() && NullChecker.m82486a(this.f41547O) && this.f41547O.m144307o()) ? false : true;
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m64075e1(TopicMoment topicMoment) {
        if (NullChecker.m82486a(this.f41541I)) {
            this.f41541I.m63945U0(topicMoment, false);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m64076f0(ArrayList<Media> arrayList) {
        if (jyb.m147479J(arrayList)) {
            return;
        }
        Iterator<Media> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().isFromShoot()) {
                m64107v0(0.0f, -1.0f);
                l51.m152888H(getAct(), new Runnable() { // from class: l.ke40
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f125298a.m64040J0();
                    }
                }, 500L);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m64077f1(String str, List list) {
        if (NullChecker.m82486a(this.f41541I) && NullChecker.m82486a(this.f41541I.f41503F)) {
            this.f41541I.f41503F.m214893e(str, list);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m64078g0() {
        if (!this.f41533A.m64212R0() || this.f41541I.m63960g1().size() <= 0) {
            return;
        }
        this.f41538F.postDelayed(new Runnable() { // from class: l.md40
            @Override // java.lang.Runnable
            public final void run() {
                this.f135864a.m64088l1();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m64079g1(String str) {
        this.f41562g.getText().insert(Selection.getSelectionEnd(this.f41562g.getText()), dth.m117874e(str));
    }

    /* JADX INFO: renamed from: h0 */
    public void m64080h0() {
        if (this.f41538F.isFinishing() || this.f41538F.isDestroyed()) {
            return;
        }
        if (!TextUtils.isEmpty(this.f41541I.f41514i)) {
            this.f41550R = true;
            this.f41562g.setText(this.f41541I.f41514i);
        }
        C11408a c11408a = this.f41541I;
        c11408a.m63947V0(c11408a.m63960g1());
        this.f41541I.m63963j1();
        this.f41562g.setMaxLength(this.f41545M);
        this.f41562g.mo29616h().subscribe(psd0.m173596G(new y20() { // from class: l.nd40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141425a.m64042K0((CharSequence) obj);
            }
        }));
        this.f41533A.m64199I0();
        this.f41539G = new xl80(this.f41538F, this, false, this);
        this.f41540H = new GridLayoutManager(this.f41538F, 3);
        this.f41565j.addItemDecoration(new b());
        this.f41565j.setLayoutManager(this.f41540H);
        this.f41565j.setAdapter(this.f41539G);
        this.f41565j.setNestedScrollingEnabled(false);
        this.f41540H.scrollToPosition(this.f41539G.getItemCount() - 1);
        m64005b0();
        m64076f0(this.f41541I.m63960g1());
        m64115z1(this.f41541I.m63960g1());
        m64037H1(this.f41541I.f41513h);
        this.f41541I.m63965l1();
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m64081h1(View view) {
        C11408a c11408a = this.f41541I;
        NewPostAct newPostAct = this.f41538F;
        Objects.requireNonNull(newPostAct);
        fd40 fd40Var = new fd40(newPostAct);
        String strM64089m0 = m64089m0();
        C11408a c11408a2 = this.f41541I;
        c11408a.m63946U1(fd40Var, strM64089m0, c11408a2.f41521p, c11408a2.f41510e);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m64082i0() {
        this.f41541I.f41521p = null;
        this.f41566k.setVisibility(8);
        lpg.m155193v().m155229j0();
        m64041J1();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM64065Z = m64065Z(layoutInflater, viewGroup);
        b9j0 b9j0Var = new b9j0(this.f41541I.f41510e, getAct(), this.f41541I);
        this.f41537E = b9j0Var;
        b9j0Var.m179763t(this.f41570o);
        if (!TextUtils.isEmpty(this.f41541I.f41516k)) {
            this.f41562g.setHint(this.f41541I.f41516k);
        }
        this.f41562g.setTypeface(null, 1);
        jyb.m147537z(jyb.m147507f0(this.f41572q, this.f41573r, this.f41576u, this.f41577v), new y20() { // from class: l.le40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131712a.m63989M0((View) obj);
            }
        });
        m64099r0().setMaxWidth(qa00.m175859d(283.0f));
        bnl0.m105524M(m64095p0(), false);
        bnl0.m105509E0(m64095p0(), new View.OnClickListener() { // from class: l.ne40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141572a.m64045N0(view);
            }
        });
        this.f41533A.m64209O0(this.f41538F, this.f41541I);
        this.f41533A.setFeedPostAudioFinishListener(new FeedPostBottomView.InterfaceC11419d() { // from class: l.oe40
            @Override // com.p051p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView.InterfaceC11419d
            /* JADX INFO: renamed from: a */
            public final void mo64239a(Audio audio) {
                this.f146965a.m64100r1(audio);
            }
        });
        this.f41533A.setFeedPostLocationListener(new FeedPostBottomView.InterfaceC11420e() { // from class: l.pe40
            @Override // com.p051p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView.InterfaceC11420e
            /* JADX INFO: renamed from: a */
            public final void mo64240a() {
                this.f151864a.m64096p1();
            }
        });
        this.f41533A.setFeedPostAtListener(new FeedPostBottomView.InterfaceC11418c() { // from class: l.qe40
            @Override // com.p051p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView.InterfaceC11418c
            /* JADX INFO: renamed from: a */
            public final void mo64238a() {
                this.f156794a.m64046O0();
            }
        });
        this.f41533A.setHideInputEditFieldAction(new x20() { // from class: l.gd40
            @Override // p153l.x20
            public final void call() {
                this.f103625a.m64109w0();
            }
        });
        if (cmg.m111190R()) {
            this.f41533A.setIMomentVisibleChangedListener(new FeedPostBottomView.InterfaceC11421f() { // from class: l.hd40
                @Override // com.p051p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView.InterfaceC11421f
                /* JADX INFO: renamed from: a */
                public final void mo64241a(String str) {
                    this.f108784a.m64048P0(str);
                }
            });
            this.f41580y.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.id40
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    i4g0.m138523u("e_allow_forwarding", "p_moment_post", new pf60("selection_situation", Integer.valueOf(z ? 1 : 0)));
                }
            });
        }
        this.f41533A.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.jd40
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.f120110a.m64050Q0(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        m64031E0();
        this.f41562g.addTextChangedListener(m64087l0());
        this.f41562g.setOnKeyEventListener(new View.OnKeyListener() { // from class: l.kd40
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return this.f125152a.m64052R0(view, i, keyEvent);
            }
        });
        this.f41562g.setEditableFactory(new gkh(new wzh(FeedHighlightSpan.class), new wzh(FeedTitleTagsSpan.class)));
        m64114z0();
        if (NullChecker.m82486a(this.f41541I.f41498A) && !jyb.m147479J(this.f41541I.f41498A.titles)) {
            trg trgVar = new trg(this.f41562g, this.f41541I.f41498A.titles);
            this.f41554V = trgVar;
            this.f41533A.m64189A1(this.f41541I.f41498A.titles, trgVar);
        }
        return getAct().setUpKeyboardDetectorLayout(viewM64065Z, new View(getAct()), new z20() { // from class: l.me40
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f136435a.m64028B1((Boolean) obj, (Integer) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public void m64083j0() {
        if (NullChecker.m82486a(this.f41543K)) {
            C4499d.m21895l().m21899k(this.f41543K);
            this.f41543K = null;
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m64084j1(View view) {
        C11408a c11408a = this.f41541I;
        NewPostAct newPostAct = this.f41538F;
        Objects.requireNonNull(newPostAct);
        c11408a.m63938Q0(new fd40(newPostAct));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m64085k0() {
        if (m64098q1()) {
            m64080h0();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m64086k1(String str) {
        if (this.f41541I.m63932L1(str, this.f41542J)) {
            this.f41538F.m68056e2();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final TextWatcher m64087l0() {
        return new a();
    }

    /* JADX INFO: renamed from: m0 */
    public final String m64089m0() {
        return NullChecker.m82486a(this.f41554V) ? this.f41554V.m192482b(this.f41562g.getText()) : this.f41562g.getText().toString();
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m64090m1() {
        this.f41533A.f41633l.setSelected(false);
    }

    /* JADX INFO: renamed from: n0 */
    public final String m64091n0() {
        Editable text = this.f41562g.getText();
        if (NullChecker.m82486a(this.f41554V)) {
            text = this.f41554V.m192491k(text);
        }
        String strTrim = text.toString().trim();
        if (cmg.m111243x() && !jyb.m147479J(this.f41541I.f41504G)) {
            Iterator<String> it = this.f41541I.f41504G.iterator();
            while (it.hasNext()) {
                strTrim = this.f41562g.getText().toString().trim().replace(it.next(), "");
            }
        }
        return strTrim;
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m64092n1(boolean z, NotifyUsers notifyUsers) {
        if (NullChecker.m82486a(notifyUsers)) {
            this.f41541I.m63934O0(notifyUsers, z);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m64093o0() {
        ArrayList<Media> arrayListM63960g1 = this.f41541I.m63960g1();
        if (!this.f41541I.m63968o1(arrayListM63960g1)) {
            arrayListM63960g1 = new ArrayList<>();
        }
        if (this.f41581z.getVisibility() == 8) {
            return ((arrayListM63960g1 == null || arrayListM63960g1.size() == 0) && TextUtils.isEmpty(m64091n0()) && this.f41541I.m63930I1()) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m64094o1() {
        if (this.f41533A.m64195E1()) {
            return;
        }
        cng.m111504g().m111508e(getAct());
    }

    /* JADX INFO: renamed from: p0 */
    public final VImage m64095p0() {
        return j4h.m143424h() ? this.f41578w : this.f41574s;
    }

    /* JADX INFO: renamed from: p1 */
    public final void m64096p1() {
        NewPostAct newPostAct = this.f41538F;
        newPostAct.startActivityForResult(NewPostLocationAct.m63887Y1(newPostAct, "p_moment_post", this.f41541I.f41527v), 10020);
        this.f41538F.overridePendingTransition(a8c0.f68909i, 0);
    }

    /* JADX INFO: renamed from: q0 */
    public final VLinear m64097q0() {
        return j4h.m143424h() ? this.f41575t : this.f41571p;
    }

    /* JADX INFO: renamed from: q1 */
    public final boolean m64098q1() {
        return this.f41539G == null;
    }

    /* JADX INFO: renamed from: r0 */
    public final VText m64099r0() {
        return j4h.m143424h() ? this.f41577v : this.f41573r;
    }

    /* JADX INFO: renamed from: r1 */
    public final void m64100r1(Audio audio) {
        m64057T1(audio);
        m64088l1();
    }

    /* JADX INFO: renamed from: s0 */
    public int m64101s0() {
        return this.f41533A.getSelectedPosition();
    }

    /* JADX INFO: renamed from: s1 */
    public void m64102s1() {
        ArrayList<Media> arrayListM63960g1 = this.f41541I.m63960g1();
        if (!this.f41541I.m63968o1(arrayListM63960g1)) {
            arrayListM63960g1 = new ArrayList<>();
        }
        if (this.f41533A.m64193D0()) {
            return;
        }
        if (m64091n0().isEmpty() && ((arrayListM63960g1 == null || arrayListM63960g1.size() == 0) && this.f41541I.m63930I1())) {
            if ("share".equals(((NewPostAct) getAct()).f41468c) || "from_h5_moment_level_open_camera".equals(((NewPostAct) getAct()).f41468c)) {
                this.f41538F.m63872g2();
                return;
            }
            C11408a c11408a = this.f41541I;
            NewPostAct newPostAct = this.f41538F;
            Objects.requireNonNull(newPostAct);
            c11408a.m63938Q0(new fd40(newPostAct));
            return;
        }
        if ((TextUtils.isEmpty(m64091n0()) && ((!NullChecker.m82487b(arrayListM63960g1) || arrayListM63960g1.size() == 0 || (TextUtils.isEmpty(arrayListM63960g1.get(0).originUrl) && TextUtils.isEmpty(arrayListM63960g1.get(0).url))) && this.f41541I.m63930I1())) || this.f41541I.f41512g || TextUtils.equals("immersion_cartoon_effects", ((NewPostAct) getAct()).f41468c) || TextUtils.equals("immersion", ((NewPostAct) getAct()).f41468c) || "share".equals(((NewPostAct) getAct()).f41468c) || "from_h5_moment_level_open_camera".equals(((NewPostAct) getAct()).f41468c)) {
            this.f41538F.m63872g2();
        } else {
            lpg.m155193v().m155229j0();
            new th0.C20312a(this.f41538F).m191150i(R$string.f39765J1).m191158q(R$string.f39855Y1).m191156o(new View.OnClickListener() { // from class: l.qd40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f156658a.m64081h1(view);
                }
            }).m191146e(R$string.f39991s1).m191144c(new View.OnClickListener() { // from class: l.be40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f76339a.m64084j1(view);
                }
            }).m191142a().m191141g();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public List<TopicMoment> m64103t0() {
        return this.f41533A.getTopicList();
    }

    /* JADX INFO: renamed from: t1 */
    public boolean m64104t1() {
        if (this.f41541I.f41502E) {
            return false;
        }
        Editable text = this.f41562g.getText();
        trg trgVar = this.f41554V;
        if (trgVar != null) {
            text = trgVar.m192491k(text);
        }
        final String string = text.toString();
        boolean zIsEmpty = TextUtils.isEmpty(string);
        C11408a c11408a = this.f41541I;
        if (zIsEmpty) {
            return c11408a.m63932L1(string, this.f41542J);
        }
        c11408a.m63953Y0(string, new x20() { // from class: l.je40
            @Override // p153l.x20
            public final void call() {
                this.f120391a.m64086k1(string);
            }
        });
        return false;
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m64105u0() {
        return PermissionHelper.m81064b("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* JADX INFO: renamed from: u1 */
    public void m64106u1(NewMomentDraft newMomentDraft) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(newMomentDraft.text)) {
            this.f41550R = true;
            if (NullChecker.m82486a(this.f41554V)) {
                spannableStringBuilder.append((CharSequence) this.f41554V.m192490j(newMomentDraft.text));
            } else {
                spannableStringBuilder.append((CharSequence) trg.m192481a(newMomentDraft.text));
            }
            this.f41562g.setText(spannableStringBuilder);
            this.f41562g.setSelection(Math.min(spannableStringBuilder.length(), this.f41545M));
        }
        if (!m64105u0() && !jyb.m147479J(newMomentDraft.images)) {
            for (Media media : newMomentDraft.images) {
                if (!TextUtils.isEmpty(media.originUrl) && !media.originUrl.contains("com.p1.mobile.putong/cache/.tantan") && !media.originUrl.contains("com.p1.mobile.putong/files/moment")) {
                    return;
                }
            }
        }
        m64032E1(newMomentDraft);
        if (newMomentDraft.images.size() > 0) {
            m64112y0(false);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m64107v0(float f, float f2) {
        this.f41533A.m64197H0(f2, m64036H0(f, f2));
    }

    /* JADX INFO: renamed from: v1 */
    public void m64108v1() {
        if (m64098q1() && this.f41544L) {
            m64080h0();
        }
        this.f41544L = false;
        if (NullChecker.m82486a(this.f41546N)) {
            m64032E1(this.f41546N);
            this.f41546N = null;
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m64109w0() {
        if (NullChecker.m82487b(this.f41562g)) {
            this.f41562g.clearFocus();
            this.f41538F.hideInput(this.f41562g);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public void m64110w1(String str, List<TopicMoment> list) {
        if (cmg.m111228p0() && NullChecker.m82486a(this.f41541I) && NullChecker.m82486a(this.f41541I.f41510e)) {
            for (final TopicMoment topicMoment : list) {
                topicMoment.selected = jyb.m147520m(this.f41541I.f41510e, new qcj() { // from class: l.ce40
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((TopicMoment) obj).f40095id.equals(topicMoment.f40095id));
                    }
                });
            }
        }
        this.f41533A.m64226p1(str, list);
    }

    /* JADX INFO: renamed from: x0 */
    public void m64111x0() {
        m64112y0(m64105u0());
    }

    /* JADX INFO: renamed from: y0 */
    public final void m64112y0(boolean z) {
        this.f41533A.m64207M1(Integer.valueOf(this.f41536D));
        this.f41533A.m64196G1(z);
        if (z) {
            return;
        }
        l51.m152888H(getAct(), new Runnable() { // from class: l.de40
            @Override // java.lang.Runnable
            public final void run() {
                this.f87987a.m64054S0();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: y1 */
    public void m64113y1(List<TopicMoment> list) {
        m64110w1("", list);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m64114z0() {
        if (this.f41538F.getIntent().getBooleanExtra("extra_show_audio_input", false)) {
            this.f41533A.m64222k1(false);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public void m64115z1(ArrayList<Media> arrayList) {
        this.f41533A.m64227q1(arrayList);
    }
}
