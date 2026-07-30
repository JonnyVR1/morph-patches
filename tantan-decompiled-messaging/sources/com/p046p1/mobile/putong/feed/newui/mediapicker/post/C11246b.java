package com.p046p1.mobile.putong.feed.newui.mediapicker.post;

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
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaMeta;
import com.p046p1.mobile.putong.data.MessageLocation;
import com.p046p1.mobile.putong.data.TopicMomentIdBox;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.MomentShareInfoParcelable;
import com.p046p1.mobile.putong.feed.data.NewMomentDraft;
import com.p046p1.mobile.putong.feed.data.NotifyUsers;
import com.p046p1.mobile.putong.feed.data.TopicCategorie;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewCaptionMediaView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.span.FeedTitleTagsSpan;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.state.FeedMomentPostStatusView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.view.FeedPostMediaRecyclerView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedSharelinkView;
import com.p046p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.apmem.tools.layouts.FlowLayout;
import p133rx.C22306c;
import p147v.VCheckBox;
import p147v.VImage;
import p147v.VLinear;
import p147v.VScroll;
import p147v.VText;
import p149l.a8c0;
import p149l.c3h;
import p149l.d30;
import p149l.e1c0;
import p149l.e30;
import p149l.e51;
import p149l.eqg;
import p149l.f2j0;
import p149l.f30;
import p149l.f3c0;
import p149l.f640;
import p149l.fyl;
import p149l.hpd0;
import p149l.hyh;
import p149l.j760;
import p149l.lrh;
import p149l.mkd0;
import p149l.n2h;
import p149l.nkg;
import p149l.nlg;
import p149l.nt4;
import p149l.od80;
import p149l.orh;
import p149l.p6j0;
import p149l.qib0;
import p149l.r440;
import p149l.rih;
import p149l.s7m;
import p149l.soe;
import p149l.t100;
import p149l.tmg;
import p149l.u1j0;
import p149l.u2h;
import p149l.uzb0;
import p149l.v9j;
import p149l.vqg;
import p149l.vwb;
import p149l.w9j;
import p149l.wng;
import p149l.xdl0;
import p149l.xh0;
import p149l.xzi0;
import p149l.zvf0;
import p149l.zyi0;

/* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.b */
/* JADX INFO: loaded from: classes12.dex */
public class C11246b implements s7m<C11245a>, fyl {

    /* JADX INFO: renamed from: X */
    public static int f40684X = t100.m186890d(290.0f);

    /* JADX INFO: renamed from: A */
    public FeedPostBottomView f40685A;

    /* JADX INFO: renamed from: B */
    public FrameLayout f40686B;

    /* JADX INFO: renamed from: C */
    public FrameLayout f40687C;

    /* JADX INFO: renamed from: E */
    public c3h<TopicMoment> f40689E;

    /* JADX INFO: renamed from: F */
    public NewPostAct f40690F;

    /* JADX INFO: renamed from: G */
    public od80 f40691G;

    /* JADX INFO: renamed from: H */
    public LinearLayoutManager f40692H;

    /* JADX INFO: renamed from: I */
    public C11245a f40693I;

    /* JADX INFO: renamed from: J */
    public MessageLocation f40694J;

    /* JADX INFO: renamed from: K */
    public String f40695K;

    /* JADX INFO: renamed from: L */
    public boolean f40696L;

    /* JADX INFO: renamed from: N */
    public NewMomentDraft f40698N;

    /* JADX INFO: renamed from: O */
    public f2j0 f40699O;

    /* JADX INFO: renamed from: P */
    public zyi0 f40700P;

    /* JADX INFO: renamed from: Q */
    public boolean f40701Q;

    /* JADX INFO: renamed from: R */
    public boolean f40702R;

    /* JADX INFO: renamed from: S */
    public lrh f40703S;

    /* JADX INFO: renamed from: T */
    public nt4 f40704T;

    /* JADX INFO: renamed from: U */
    public tmg f40705U;

    /* JADX INFO: renamed from: V */
    public eqg f40706V;

    /* JADX INFO: renamed from: a */
    public VLinear f40708a;

    /* JADX INFO: renamed from: b */
    public VImage f40709b;

    /* JADX INFO: renamed from: c */
    public FeedMomentPostStatusView f40710c;

    /* JADX INFO: renamed from: d */
    public TextView f40711d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f40712e;

    /* JADX INFO: renamed from: f */
    public VScroll f40713f;

    /* JADX INFO: renamed from: g */
    public FeedEditText f40714g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f40715h;

    /* JADX INFO: renamed from: i */
    public View f40716i;

    /* JADX INFO: renamed from: j */
    public FeedPostMediaRecyclerView f40717j;

    /* JADX INFO: renamed from: k */
    public RelativeLayout f40718k;

    /* JADX INFO: renamed from: l */
    public FeedAudioPlayerView f40719l;

    /* JADX INFO: renamed from: m */
    public VImage f40720m;

    /* JADX INFO: renamed from: n */
    public FeedSharelinkView f40721n;

    /* JADX INFO: renamed from: o */
    public FlowLayout f40722o;

    /* JADX INFO: renamed from: p */
    public VLinear f40723p;

    /* JADX INFO: renamed from: q */
    public VImage f40724q;

    /* JADX INFO: renamed from: r */
    public VText f40725r;

    /* JADX INFO: renamed from: s */
    public VImage f40726s;

    /* JADX INFO: renamed from: t */
    public VLinear f40727t;

    /* JADX INFO: renamed from: u */
    public VImage f40728u;

    /* JADX INFO: renamed from: v */
    public VText f40729v;

    /* JADX INFO: renamed from: w */
    public VImage f40730w;

    /* JADX INFO: renamed from: x */
    public RelativeLayout f40731x;

    /* JADX INFO: renamed from: y */
    public VCheckBox f40732y;

    /* JADX INFO: renamed from: z */
    public VText f40733z;

    /* JADX INFO: renamed from: D */
    public int f40688D = f40684X;

    /* JADX INFO: renamed from: M */
    public int f40697M = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;

    /* JADX INFO: renamed from: W */
    public hpd0 f40707W = new hpd0("has_show_post_moment_long_click_tip" + qib0.f154713b0.f139230a.userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.b$a */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (nkg.m159914x() && NullChecker.m81303a(C11246b.this.f40705U)) {
                C11246b.this.f40705U.m189691b(editable, C11246b.this.f40693I.f40657H, C11246b.this.f40693I.f40656G);
                if (!vwb.m200296J(C11246b.this.f40693I.f40657H)) {
                    for (NotifyUsers notifyUsers : C11246b.this.f40693I.f40657H) {
                        final TopicMoment topicMomentNew_ = TopicMoment.new_();
                        TopicMomentIdBox topicMomentIdBox = notifyUsers.topic;
                        topicMomentNew_.f39247id = topicMomentIdBox.f38824id;
                        topicMomentNew_.name = topicMomentIdBox.name;
                        if (!vwb.m200337m(C11246b.this.f40693I.f40662e, new w9j() { // from class: l.d640
                            @Override // p149l.w9j
                            public final Object call(Object obj) {
                                return Boolean.valueOf(TextUtils.equals(((TopicMoment) obj).f39247id, topicMomentNew_.f39247id));
                            }
                        }) && C11246b.this.f40693I.f40662e.size() < 3) {
                            C11246b.this.f40693I.f40662e.add(topicMomentNew_);
                            C11246b.this.f40693I.m62760S1(C11246b.this.f40693I.f40662e);
                        }
                    }
                }
            }
            xdl0.m208344M(C11246b.this.f40733z, false);
            C11246b.this.m62858J1();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m62935c() {
            C11246b.this.m62864O1(true);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2;
            int i4;
            int i5;
            int i6;
            if (!NullChecker.m81303a(C11246b.this.f40700P) || C11246b.this.f40702R) {
                charSequence2 = charSequence;
                i4 = i;
                i5 = i2;
                i6 = i3;
                C11246b.this.f40702R = false;
            } else {
                C11246b.this.f40702R = false;
                charSequence2 = charSequence;
                i4 = i;
                i5 = i2;
                i6 = i3;
                C11246b.this.f40700P.m220931k(C11246b.this.f40714g, charSequence2, i4, i5, i6);
            }
            if (NullChecker.m81303a(C11246b.this.f40705U)) {
                int i7 = i5;
                int i8 = i6;
                C11246b.this.f40705U.m189695f(C11246b.this.f40714g, charSequence2, i4, i7, i8, new d30() { // from class: l.e640
                    @Override // p149l.d30
                    public final void call() {
                        this.f89499a.m62935c();
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.b$b */
    public class b extends RecyclerView.AbstractC0576n {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
            rect.left = 0;
            rect.right = t100.m186890d(NewCaptionMediaView.f40469f);
            rect.top = t100.m186890d(NewCaptionMediaView.f40469f);
            rect.bottom = 0;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.b$c */
    public class c extends C0605k.e {

        /* JADX INFO: renamed from: d */
        public boolean f40736d;

        /* JADX INFO: renamed from: e */
        public RecyclerView.AbstractC0566d0 f40737e;

        public c() {
        }

        @Override // androidx.recyclerview.widget.C0605k.e
        /* JADX INFO: renamed from: A */
        public void mo3772A(@Nullable RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
            super.mo3772A(abstractC0566d0, i);
            int childCount = C11246b.this.f40717j.getLayoutManager().getChildCount();
            if (i != 0) {
                if (this.f40737e == null) {
                    this.f40737e = abstractC0566d0;
                }
                C11246b.this.m62884Z1(this.f40737e, childCount, false);
            } else {
                C11246b.this.m62884Z1(this.f40737e, childCount, true);
                this.f40737e = null;
            }
            if (this.f40736d) {
                C11246b.this.f40685A.m63042o1(false);
            }
        }

        @Override // androidx.recyclerview.widget.C0605k.e
        /* JADX INFO: renamed from: B */
        public void mo3773B(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        }

        @Override // androidx.recyclerview.widget.C0605k.e
        /* JADX INFO: renamed from: k */
        public int mo3783k(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0) {
            int itemViewType = abstractC0566d0.getItemViewType();
            od80 unused = C11246b.this.f40691G;
            if (itemViewType != 0) {
                return 0;
            }
            return C0605k.e.m3771t(15, 0);
        }

        @Override // androidx.recyclerview.widget.C0605k.e
        /* JADX INFO: renamed from: y */
        public boolean mo3795y(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0, RecyclerView.AbstractC0566d0 abstractC0566d1) {
            int adapterPosition = abstractC0566d0.getAdapterPosition();
            int adapterPosition2 = abstractC0566d1.getAdapterPosition();
            ArrayList<Media> arrayListM62777g1 = C11246b.this.f40693I.m62777g1();
            if (adapterPosition2 != arrayListM62777g1.size() && adapterPosition != arrayListM62777g1.size()) {
                if (adapterPosition < adapterPosition2) {
                    int i = adapterPosition;
                    while (i < adapterPosition2) {
                        int i2 = i + 1;
                        if (i2 >= arrayListM62777g1.size()) {
                            break;
                        }
                        Collections.swap(arrayListM62777g1, i, i2);
                        i = i2;
                    }
                } else {
                    for (int i3 = adapterPosition; i3 > adapterPosition2 && i3 > 0; i3--) {
                        Collections.swap(arrayListM62777g1, i3, i3 - 1);
                    }
                }
                this.f40736d = true;
                C11246b.this.f40685A.setSelectedImages(arrayListM62777g1);
                C11246b.this.f40691G.notifyItemMoved(adapterPosition, adapterPosition2);
            }
            return true;
        }
    }

    public C11246b(NewPostAct newPostAct) {
        this.f40690F = newPostAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public /* synthetic */ void m62803L0(View view) {
        zvf0.m220399u("e_poi_tag", "p_moment_post", vwb.m200311Y("poitagshow", Integer.valueOf(this.f40693I.f40680w ? 1 : 0)));
        m62913p1();
    }

    /* JADX INFO: renamed from: L1 */
    private void m62804L1(Integer num) {
        if (num.intValue() != 0 && this.f40688D != num.intValue()) {
            this.f40688D = num.intValue();
        }
        this.f40685A.setAlbumHeight(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public /* synthetic */ void m62806M0(View view) {
        if (NullChecker.m81303a(view)) {
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.x440
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f190939a.m62803L0(view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public /* synthetic */ void m62815U0(View view) {
        this.f40690F.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m62817V0(View view) {
        this.f40690F.m62687c2();
    }

    /* JADX INFO: renamed from: b0 */
    private void m62822b0() {
        new C0605k(new c()).m3750g(this.f40717j);
    }

    /* JADX INFO: renamed from: A0 */
    public void m62842A0() {
        int iIntValue = Act.savedKeyboardHeight.get().intValue();
        if (iIntValue == 0 || iIntValue == t100.m186890d(220.0f)) {
            return;
        }
        this.f40688D = iIntValue;
    }

    /* JADX INFO: renamed from: A1 */
    public void m62843A1(ArrayList<Media> arrayList) {
        if (arrayList.size() > 0) {
            Media media = arrayList.get(0);
            if (media instanceof Audio) {
                m62917r1((Audio) media);
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m62844B0() {
        this.f40690F.lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.s540
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162485a.m62873T0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B1 */
    public final void m62845B1(Boolean bool, Integer num) {
        this.f40701Q = bool.booleanValue();
        m62804L1(num);
        this.f40685A.m63047t1(bool);
        if (nkg.m159899p0() && NullChecker.m81303a(this.f40699O)) {
            boolean zBooleanValue = bool.booleanValue();
            f2j0 f2j0Var = this.f40699O;
            if (zBooleanValue) {
                f2j0Var.m119199G(num.intValue());
            } else {
                f2j0Var.m119206m();
            }
        }
        if (nkg.m159914x() && NullChecker.m81303a(this.f40704T)) {
            boolean zBooleanValue2 = bool.booleanValue();
            nt4 nt4Var = this.f40704T;
            if (zBooleanValue2) {
                nt4Var.m161322r(num.intValue());
            } else {
                nt4Var.m161312h();
            }
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f40690F;
    }

    /* JADX INFO: renamed from: C1 */
    public void m62846C1(boolean z) {
        this.f40685A.m63048u1(z);
    }

    /* JADX INFO: renamed from: D0 */
    public void m62847D0(Bundle bundle) {
        m62902k0();
        m62868Q1();
        m62852G1();
        if (u2h.m191499h()) {
            this.f40709b.setImageResource(f3c0.f94356J3);
            Drawable drawable = this.f40690F.getResources().getDrawable(f3c0.f94392O3);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            this.f40711d.setCompoundDrawables(null, null, drawable, null);
            this.f40711d.setCompoundDrawablePadding(t100.m186890d(2.0f));
            soe.m185291a(this.f40714g);
            this.f40714g.setHintTextColor(this.f40690F.getResources().getColor(e1c0.f88786h));
            this.f40714g.setTextColor(this.f40690F.getResources().getColor(e1c0.f88784g));
        }
        xdl0.m208329E0(this.f40709b, new View.OnClickListener() { // from class: l.a540
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67629a.m62815U0(view);
            }
        });
        this.f40711d.setClickable(false);
        xdl0.m208329E0(this.f40711d, new View.OnClickListener() { // from class: l.b540
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f73439a.m62817V0(view);
            }
        });
        if (nkg.m159909u0()) {
            xdl0.m208344M(this.f40710c, true);
            this.f40710c.m63063R(this.f40690F);
            this.f40693I.m62775d1();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m62848E0() {
        if (vqg.m199558m0()) {
            m62844B0();
            this.f40685A.m63020K0(new d30() { // from class: l.e540
                @Override // p149l.d30
                public final void call() {
                    this.f89347a.m62877W0();
                }
            });
            this.f40720m.setOnClickListener(new View.OnClickListener() { // from class: l.f540
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f94957a.m62878X0(view);
                }
            });
        }
        if (nkg.m159899p0()) {
            this.f40699O = new f2j0(this.f40690F, this.f40686B);
            this.f40685A.f40778e.setAddTopicClickHooker(new d30() { // from class: l.g540
                @Override // p149l.d30
                public final void call() {
                    this.f100620a.m62880Y0();
                }
            });
            this.f40699O.m119194B(new d30() { // from class: l.h540
                @Override // p149l.d30
                public final void call() {
                    this.f105923a.m62883Z0();
                }
            });
            this.f40699O.m119193A(new v9j() { // from class: l.i540
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f111524a.m62887a1();
                }
            });
            this.f40699O.m119195C(new e30() { // from class: l.j540
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f116267a.m62890d1((String) obj);
                }
            });
            this.f40699O.m119197E(new e30() { // from class: l.k540
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f121142a.m62892e1((TopicMoment) obj);
                }
            });
            this.f40699O.m119196D(new f30() { // from class: l.l540
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f126081a.m62894f1((String) obj, (List) obj2);
                }
            });
            this.f40700P = new zyi0(this.f40693I, this.f40699O);
        }
        if (nkg.m159914x()) {
            nt4 nt4Var = new nt4(this.f40690F, this.f40687C);
            this.f40704T = nt4Var;
            nt4Var.m161320p(new e30() { // from class: l.m540
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f131364a.m62896g1((String) obj);
                }
            });
            this.f40705U = new tmg(this.f40704T);
        }
    }

    /* JADX INFO: renamed from: E1 */
    public final void m62849E1(NewMomentDraft newMomentDraft) {
        ArrayList<Media> arrayList = (ArrayList) newMomentDraft.images;
        if (!vwb.m200296J(arrayList) && (arrayList.get(0) instanceof Audio)) {
            m62924v0(0.0f, -1.0f);
            e51.m114743H(getAct(), new Runnable() { // from class: l.d540
                @Override // java.lang.Runnable
                public final void run() {
                    this.f84374a.m62905l1();
                }
            }, 500L);
        }
        m62932z1(arrayList);
        this.f40693I.f40661d.onNext((ArrayList) newMomentDraft.images);
    }

    /* JADX INFO: renamed from: F1 */
    public void m62850F1(ArrayList<Media> arrayList) {
        if (!this.f40693I.m62785o1(arrayList)) {
            arrayList = new ArrayList<>();
        }
        if (NullChecker.m81303a(this.f40691G)) {
            this.f40691G.m163654H(arrayList);
            if (!this.f40707W.get().booleanValue() && NullChecker.m81303a(arrayList) && arrayList.size() >= 2) {
                this.f40707W.put(Boolean.TRUE);
                m62875U1();
            }
            if (arrayList == null || arrayList.size() < 2) {
                m62900j0();
            }
            if (nkg.m159861R() && !vwb.m200296J(arrayList) && (arrayList.get(0) instanceof Video)) {
                m62866P1(true);
            } else {
                m62866P1(false);
            }
            if (vwb.m200296J(arrayList) || !(arrayList.get(0) instanceof Video)) {
                xdl0.m208357U(this.f40717j, t100.m186890d(13.0f));
            } else {
                xdl0.m208357U(this.f40717j, t100.f167264m);
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m62851G0(float f, float f2) {
        int[] iArr = new int[2];
        this.f40714g.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return f >= ((float) i) && f <= ((float) (i + this.f40714g.getWidth())) && f2 >= ((float) i2) && f2 <= ((float) (i2 + this.f40714g.getHeight()));
    }

    /* JADX INFO: renamed from: G1 */
    public void m62852G1() {
        MomentShareInfoParcelable momentShareInfoParcelable = this.f40693I.f40674q;
        FeedSharelinkView feedSharelinkView = this.f40721n;
        if (momentShareInfoParcelable == null) {
            xdl0.m208344M(feedSharelinkView, false);
            return;
        }
        xdl0.m208344M(feedSharelinkView, true);
        this.f40721n.m65232e(this.f40693I.f40674q, "p_moment_post");
        this.f40721n.setCanClick(false);
    }

    /* JADX INFO: renamed from: H0 */
    public final boolean m62853H0(float f, float f2) {
        return f2 > 0.0f && !m62851G0(f, f2);
    }

    /* JADX INFO: renamed from: H1 */
    public void m62854H1(String str) {
        this.f40685A.m63052y1(str);
    }

    /* JADX INFO: renamed from: I1 */
    public void m62856I1(ArrayList<TopicMoment> arrayList) {
        this.f40685A.m63054z1();
        if (!NullChecker.m81303a(arrayList) || arrayList.size() <= 0) {
            xdl0.m208344M(this.f40722o, false);
        } else {
            xdl0.m208344M(this.f40722o, true);
        }
        ((xzi0) this.f40689E).m211995E(arrayList);
    }

    /* JADX INFO: renamed from: J1 */
    public void m62858J1() {
        boolean zM62910o0 = m62910o0();
        this.f40711d.setClickable(zM62910o0);
        this.f40690F.m62683Y1(zM62910o0, this.f40711d);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m62859K0(CharSequence charSequence) {
        m62858J1();
    }

    /* JADX INFO: renamed from: K1 */
    public void m62860K1(j760<List<TopicCategorie>, List<TopicMoment>> j760Var) {
        this.f40685A.m63008B1(j760Var);
    }

    /* JADX INFO: renamed from: M1 */
    public final void m62861M1(Media media) {
        if (NullChecker.m81303a(media.meta)) {
            return;
        }
        MediaMeta mediaMetaNew_ = MediaMeta.new_();
        media.meta = mediaMetaNew_;
        mediaMetaNew_.type = "voice";
    }

    /* JADX INFO: renamed from: N0 */
    public final /* synthetic */ void m62862N0(View view) {
        this.f40694J = null;
        m62916r0().setText((CharSequence) null);
        m62914q0().setVisibility(8);
    }

    /* JADX INFO: renamed from: O0 */
    public final /* synthetic */ void m62863O0() {
        p6j0.m167669c("e_moment_at", "p_moment_post", new j760[0]);
        m62888c0();
    }

    /* JADX INFO: renamed from: O1 */
    public final void m62864O1(final boolean z) {
        if (this.f40703S == null) {
            this.f40703S = new lrh(this.f40690F, a8c0.f68016e, new d30() { // from class: l.q540
                @Override // p149l.d30
                public final void call() {
                    this.f152726a.m62907m1();
                }
            }).m151371t(false);
        }
        this.f40703S.m151374z(orh.m165570c());
        this.f40703S.m151370A(new e30() { // from class: l.r540
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157756a.m62909n1(z, (NotifyUsers) obj);
            }
        });
        this.f40703S.show();
    }

    /* JADX INFO: renamed from: P0 */
    public final /* synthetic */ void m62865P0(String str) {
        if (TextUtils.equals(str, "everyone")) {
            m62866P1(true);
        } else {
            m62866P1(false);
        }
    }

    /* JADX INFO: renamed from: P1 */
    public void m62866P1(boolean z) {
        if (xdl0.m208349O0(this.f40731x) && z) {
            return;
        }
        if (z) {
            zvf0.m220368A("e_allow_forwarding", "p_moment_post", new j760("selection_situation", 1));
        }
        xdl0.m208344M(this.f40731x, z);
        this.f40732y.setChecked(z);
    }

    /* JADX INFO: renamed from: Q0 */
    public final /* synthetic */ void m62867Q0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f40713f.getLayoutParams();
        layoutParams.bottomMargin = this.f40712e.getHeight() - i2;
        this.f40713f.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m62868Q1() {
        e51.m114743H(getAct(), new Runnable() { // from class: l.t540
            @Override // java.lang.Runnable
            public final void run() {
                this.f167789a.m62911o1();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: R0 */
    public final /* synthetic */ boolean m62869R0(View view, int i, KeyEvent keyEvent) {
        if (i != 67 || keyEvent.getAction() != 0) {
            return false;
        }
        if (NullChecker.m81303a(this.f40705U)) {
            this.f40705U.m189694e(this.f40714g.getText());
        }
        if (!NullChecker.m81303a(this.f40706V)) {
            return false;
        }
        this.f40706V.m117743e(this.f40714g.getText());
        return false;
    }

    /* JADX INFO: renamed from: R1 */
    public void m62870R1() {
        if (!NullChecker.m81303a(this.f40693I.f40672o)) {
            this.f40694J = null;
            m62916r0().setText((CharSequence) null);
            m62914q0().setVisibility(8);
            return;
        }
        MessageLocation messageLocation = new MessageLocation();
        this.f40694J = messageLocation;
        C11245a c11245a = this.f40693I;
        messageLocation.name = c11245a.f40670m;
        messageLocation.address = c11245a.f40671n;
        messageLocation.coordinates = c11245a.f40672o;
        m62916r0().setText(this.f40694J.name);
        m62914q0().setVisibility(0);
        zvf0.m220368A("e_poi_tag", "p_moment_post", vwb.m200311Y("poitagshow", Integer.valueOf(this.f40693I.f40680w ? 1 : 0)));
    }

    /* JADX INFO: renamed from: S1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m62905l1() {
        xdl0.m208320A(this.f40714g);
        getAct().showInput(this.f40714g, 0);
        this.f40714g.requestFocus();
    }

    /* JADX INFO: renamed from: T0 */
    public final /* synthetic */ void m62873T0(C4319c c4319c) {
        if (c4319c == C4319c.f15549j) {
            this.f40685A.m63019J1();
        }
    }

    /* JADX INFO: renamed from: T1 */
    public final void m62874T1(Audio audio) {
        this.f40693I.m62777g1().clear();
        this.f40693I.f40673p = audio;
        this.f40718k.setVisibility(0);
        this.f40719l.m66279X0(audio.duration, audio.url);
        m62858J1();
        m62861M1(audio);
    }

    /* JADX INFO: renamed from: U1 */
    public final void m62875U1() {
        this.f40695K = C4348d.m20896l().m20908t(new C4345a(this.f40690F).m20849D(this.f40690F.getResources().getString(R$string.f38905H1)).m20873o(C4345a.f15681O, t100.m186890d(8.0f)).m20875q(C4345a.f15683Q | C4345a.f15681O).m20861b(3000L), this.f40716i);
    }

    /* JADX INFO: renamed from: V1 */
    public void m62876V1(boolean z) {
        this.f40685A.m63021K1(z);
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m62877W0() {
        if (NullChecker.m81303a(this.f40704T)) {
            this.f40704T.m161311g();
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m62878X0(View view) {
        m62899i0();
    }

    /* JADX INFO: renamed from: X1 */
    public boolean m62879X1() {
        return this.f40685A.m63023L1();
    }

    /* JADX INFO: renamed from: Y0 */
    public final /* synthetic */ void m62880Y0() {
        zvf0.m220396r("e_create_topic", "p_moment_post");
        if (!this.f40701Q) {
            this.f40714g.requestFocus();
            this.f40690F.showInput(this.f40714g, 0);
        }
        int selectionStart = this.f40714g.getSelectionStart();
        Editable text = this.f40714g.getText();
        if (selectionStart <= 0 || !"#".equals(text.subSequence(selectionStart - 1, selectionStart).toString())) {
            n2h.m157640a(this.f40714g, "#");
            return;
        }
        this.f40700P.m220923c();
        this.f40699O.m119198F();
        this.f40699O.m119217x("");
    }

    /* JADX INFO: renamed from: Y1 */
    public void m62881Y1() {
        if (nkg.m159909u0()) {
            this.f40710c.m63066l0(this.f40693I.m62776e1());
        }
    }

    /* JADX INFO: renamed from: Z */
    public View m62882Z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f640.m119581b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Z0 */
    public final /* synthetic */ void m62883Z0() {
        this.f40685A.f40778e.m62976G();
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m62884Z1(RecyclerView.AbstractC0566d0 abstractC0566d0, int i, boolean z) {
        for (int i2 = 0; i2 < i; i2++) {
            View childAt = this.f40717j.getLayoutManager().getChildAt(i2);
            if (NullChecker.m81303a(abstractC0566d0) && childAt == abstractC0566d0.itemView) {
                ((NewCaptionMediaView) childAt).setImageDeleteVisible(z);
            } else {
                childAt.setScaleX(z ? 1.0f : 0.9f);
                childAt.setScaleY(z ? 1.0f : 0.9f);
            }
        }
    }

    @Override // p149l.fyl
    /* JADX INFO: renamed from: a */
    public void mo62885a() {
        this.f40693I.m62778h1(this.f40691G.m163653G());
    }

    /* JADX INFO: renamed from: a0 */
    public void m62886a0(String str, boolean z) {
        String string = this.f40714g.getText().toString();
        String strSubstring = (string.length() <= 0 || !z) ? "" : string.substring(string.length() - 1);
        StringBuilder sb = new StringBuilder();
        sb.append(TextUtils.equals(strSubstring, "@") ? "" : "@");
        sb.append(str);
        this.f40714g.getText().insert(Selection.getSelectionEnd(this.f40714g.getText()), sb.toString());
        this.f40685A.m63024M1(Integer.valueOf(this.f40688D));
        e51.m114743H(getAct(), new Runnable() { // from class: l.u540
            @Override // java.lang.Runnable
            public final void run() {
                this.f174651a.m62855I0();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: a1 */
    public final /* synthetic */ C22306c m62887a1() {
        u1j0 u1j0Var;
        C11245a c11245a = this.f40693I;
        if (c11245a == null || (u1j0Var = c11245a.f40655F) == null) {
            return null;
        }
        return u1j0Var.m191418c();
    }

    /* JADX INFO: renamed from: c0 */
    public final void m62888c0() {
        this.f40685A.m63013G1(false);
        this.f40685A.m63053z0();
        m62864O1(false);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C11245a c11245a) {
        this.f40693I = c11245a;
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m62890d1(String str) {
        if (NullChecker.m81303a(this.f40693I)) {
            this.f40693I.m62773a1(str);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public boolean m62891e0() {
        return (nkg.m159899p0() && NullChecker.m81303a(this.f40699O) && this.f40699O.m119208o()) ? false : true;
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m62892e1(TopicMoment topicMoment) {
        if (NullChecker.m81303a(this.f40693I)) {
            this.f40693I.m62762U0(topicMoment, false);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m62893f0(ArrayList<Media> arrayList) {
        if (vwb.m200296J(arrayList)) {
            return;
        }
        Iterator<Media> it = arrayList.iterator();
        while (it.hasNext()) {
            if (it.next().isFromShoot()) {
                m62924v0(0.0f, -1.0f);
                e51.m114743H(getAct(), new Runnable() { // from class: l.w540
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f184641a.m62857J0();
                    }
                }, 500L);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m62894f1(String str, List list) {
        if (NullChecker.m81303a(this.f40693I) && NullChecker.m81303a(this.f40693I.f40655F)) {
            this.f40693I.f40655F.m191420e(str, list);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m62895g0() {
        if (!this.f40685A.m63029R0() || this.f40693I.m62777g1().size() <= 0) {
            return;
        }
        this.f40690F.postDelayed(new Runnable() { // from class: l.y440
            @Override // java.lang.Runnable
            public final void run() {
                this.f195895a.m62905l1();
            }
        }, 200L);
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m62896g1(String str) {
        this.f40714g.getText().insert(Selection.getSelectionEnd(this.f40714g.getText()), orh.m165572e(str));
    }

    /* JADX INFO: renamed from: h0 */
    public void m62897h0() {
        if (this.f40690F.isFinishing() || this.f40690F.isDestroyed()) {
            return;
        }
        if (!TextUtils.isEmpty(this.f40693I.f40666i)) {
            this.f40702R = true;
            this.f40714g.setText(this.f40693I.f40666i);
        }
        C11245a c11245a = this.f40693I;
        c11245a.m62764V0(c11245a.m62777g1());
        this.f40693I.m62780j1();
        this.f40714g.setMaxLength(this.f40697M);
        this.f40714g.mo28617h().subscribe(mkd0.m154955G(new e30() { // from class: l.z440
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201438a.m62859K0((CharSequence) obj);
            }
        }));
        this.f40685A.m63016I0();
        this.f40691G = new od80(this.f40690F, this, false, this);
        this.f40692H = new GridLayoutManager(this.f40690F, 3);
        this.f40717j.addItemDecoration(new b());
        this.f40717j.setLayoutManager(this.f40692H);
        this.f40717j.setAdapter(this.f40691G);
        this.f40717j.setNestedScrollingEnabled(false);
        this.f40692H.scrollToPosition(this.f40691G.getItemCount() - 1);
        m62822b0();
        m62893f0(this.f40693I.m62777g1());
        m62932z1(this.f40693I.m62777g1());
        m62854H1(this.f40693I.f40665h);
        this.f40693I.m62782l1();
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m62898h1(View view) {
        C11245a c11245a = this.f40693I;
        NewPostAct newPostAct = this.f40690F;
        Objects.requireNonNull(newPostAct);
        r440 r440Var = new r440(newPostAct);
        String strM62906m0 = m62906m0();
        C11245a c11245a2 = this.f40693I;
        c11245a.m62763U1(r440Var, strM62906m0, c11245a2.f40673p, c11245a2.f40662e);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m62899i0() {
        this.f40693I.f40673p = null;
        this.f40718k.setVisibility(8);
        wng.m204695v().m204731j0();
        m62858J1();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM62882Z = m62882Z(layoutInflater, viewGroup);
        xzi0 xzi0Var = new xzi0(this.f40693I.f40662e, getAct(), this.f40693I);
        this.f40689E = xzi0Var;
        xzi0Var.m105022t(this.f40722o);
        if (!TextUtils.isEmpty(this.f40693I.f40668k)) {
            this.f40714g.setHint(this.f40693I.f40668k);
        }
        this.f40714g.setTypeface(null, 1);
        vwb.m200354z(vwb.m200324f0(this.f40724q, this.f40725r, this.f40728u, this.f40729v), new e30() { // from class: l.x540
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191088a.m62806M0((View) obj);
            }
        });
        m62916r0().setMaxWidth(t100.m186890d(283.0f));
        xdl0.m208344M(m62912p0(), false);
        xdl0.m208329E0(m62912p0(), new View.OnClickListener() { // from class: l.z540
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201749a.m62862N0(view);
            }
        });
        this.f40685A.m63026O0(this.f40690F, this.f40693I);
        this.f40685A.setFeedPostAudioFinishListener(new FeedPostBottomView.InterfaceC11256d() { // from class: l.a640
            @Override // com.p046p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView.InterfaceC11256d
            /* JADX INFO: renamed from: a */
            public final void mo63056a(Audio audio) {
                this.f67739a.m62917r1(audio);
            }
        });
        this.f40685A.setFeedPostLocationListener(new FeedPostBottomView.InterfaceC11257e() { // from class: l.b640
            @Override // com.p046p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView.InterfaceC11257e
            /* JADX INFO: renamed from: a */
            public final void mo63057a() {
                this.f73742a.m62913p1();
            }
        });
        this.f40685A.setFeedPostAtListener(new FeedPostBottomView.InterfaceC11255c() { // from class: l.c640
            @Override // com.p046p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView.InterfaceC11255c
            /* JADX INFO: renamed from: a */
            public final void mo63055a() {
                this.f79436a.m62863O0();
            }
        });
        this.f40685A.setHideInputEditFieldAction(new d30() { // from class: l.s440
            @Override // p149l.d30
            public final void call() {
                this.f162266a.m62926w0();
            }
        });
        if (nkg.m159861R()) {
            this.f40685A.setIMomentVisibleChangedListener(new FeedPostBottomView.InterfaceC11258f() { // from class: l.t440
                @Override // com.p046p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomView.InterfaceC11258f
                /* JADX INFO: renamed from: a */
                public final void mo63058a(String str) {
                    this.f167687a.m62865P0(str);
                }
            });
            this.f40732y.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.u440
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    zvf0.m220399u("e_allow_forwarding", "p_moment_post", new j760("selection_situation", Integer.valueOf(z ? 1 : 0)));
                }
            });
        }
        this.f40685A.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.v440
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                this.f179879a.m62867Q0(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        m62848E0();
        this.f40714g.addTextChangedListener(m62904l0());
        this.f40714g.setOnKeyEventListener(new View.OnKeyListener() { // from class: l.w440
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return this.f184473a.m62869R0(view, i, keyEvent);
            }
        });
        this.f40714g.setEditableFactory(new rih(new hyh(FeedHighlightSpan.class), new hyh(FeedTitleTagsSpan.class)));
        m62931z0();
        if (NullChecker.m81303a(this.f40693I.f40650A) && !vwb.m200296J(this.f40693I.f40650A.titles)) {
            eqg eqgVar = new eqg(this.f40714g, this.f40693I.f40650A.titles);
            this.f40706V = eqgVar;
            this.f40685A.m63006A1(this.f40693I.f40650A.titles, eqgVar);
        }
        return getAct().setUpKeyboardDetectorLayout(viewM62882Z, new View(getAct()), new f30() { // from class: l.y540
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f196380a.m62845B1((Boolean) obj, (Integer) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public void m62900j0() {
        if (NullChecker.m81303a(this.f40695K)) {
            C4348d.m20896l().m20900k(this.f40695K);
            this.f40695K = null;
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m62901j1(View view) {
        C11245a c11245a = this.f40693I;
        NewPostAct newPostAct = this.f40690F;
        Objects.requireNonNull(newPostAct);
        c11245a.m62755Q0(new r440(newPostAct));
    }

    /* JADX INFO: renamed from: k0 */
    public final void m62902k0() {
        if (m62915q1()) {
            m62897h0();
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m62903k1(String str) {
        if (this.f40693I.m62749L1(str, this.f40694J)) {
            this.f40690F.m66873d2();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final TextWatcher m62904l0() {
        return new a();
    }

    /* JADX INFO: renamed from: m0 */
    public final String m62906m0() {
        return NullChecker.m81303a(this.f40706V) ? this.f40706V.m117740b(this.f40714g.getText()) : this.f40714g.getText().toString();
    }

    /* JADX INFO: renamed from: m1 */
    public final /* synthetic */ void m62907m1() {
        this.f40685A.f40785l.setSelected(false);
    }

    /* JADX INFO: renamed from: n0 */
    public final String m62908n0() {
        Editable text = this.f40714g.getText();
        if (NullChecker.m81303a(this.f40706V)) {
            text = this.f40706V.m117749k(text);
        }
        String strTrim = text.toString().trim();
        if (nkg.m159914x() && !vwb.m200296J(this.f40693I.f40656G)) {
            Iterator<String> it = this.f40693I.f40656G.iterator();
            while (it.hasNext()) {
                strTrim = this.f40714g.getText().toString().trim().replace(it.next(), "");
            }
        }
        return strTrim;
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m62909n1(boolean z, NotifyUsers notifyUsers) {
        if (NullChecker.m81303a(notifyUsers)) {
            this.f40693I.m62751O0(notifyUsers, z);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public boolean m62910o0() {
        ArrayList<Media> arrayListM62777g1 = this.f40693I.m62777g1();
        if (!this.f40693I.m62785o1(arrayListM62777g1)) {
            arrayListM62777g1 = new ArrayList<>();
        }
        if (this.f40733z.getVisibility() == 8) {
            return ((arrayListM62777g1 == null || arrayListM62777g1.size() == 0) && TextUtils.isEmpty(m62908n0()) && this.f40693I.m62747I1()) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m62911o1() {
        if (this.f40685A.m63012E1()) {
            return;
        }
        nlg.m160044g().m160048e(getAct());
    }

    /* JADX INFO: renamed from: p0 */
    public final VImage m62912p0() {
        return u2h.m191499h() ? this.f40730w : this.f40726s;
    }

    /* JADX INFO: renamed from: p1 */
    public final void m62913p1() {
        NewPostAct newPostAct = this.f40690F;
        newPostAct.startActivityForResult(NewPostLocationAct.m62704X1(newPostAct, "p_moment_post", this.f40693I.f40679v), 10020);
        this.f40690F.overridePendingTransition(uzb0.f178984i, 0);
    }

    /* JADX INFO: renamed from: q0 */
    public final VLinear m62914q0() {
        return u2h.m191499h() ? this.f40727t : this.f40723p;
    }

    /* JADX INFO: renamed from: q1 */
    public final boolean m62915q1() {
        return this.f40691G == null;
    }

    /* JADX INFO: renamed from: r0 */
    public final VText m62916r0() {
        return u2h.m191499h() ? this.f40729v : this.f40725r;
    }

    /* JADX INFO: renamed from: r1 */
    public final void m62917r1(Audio audio) {
        m62874T1(audio);
        m62905l1();
    }

    /* JADX INFO: renamed from: s0 */
    public int m62918s0() {
        return this.f40685A.getSelectedPosition();
    }

    /* JADX INFO: renamed from: s1 */
    public void m62919s1() {
        ArrayList<Media> arrayListM62777g1 = this.f40693I.m62777g1();
        if (!this.f40693I.m62785o1(arrayListM62777g1)) {
            arrayListM62777g1 = new ArrayList<>();
        }
        if (this.f40685A.m63010D0()) {
            return;
        }
        if (m62908n0().isEmpty() && ((arrayListM62777g1 == null || arrayListM62777g1.size() == 0) && this.f40693I.m62747I1())) {
            if ("share".equals(((NewPostAct) getAct()).f40620c) || "from_h5_moment_level_open_camera".equals(((NewPostAct) getAct()).f40620c)) {
                this.f40690F.m62689e2();
                return;
            }
            C11245a c11245a = this.f40693I;
            NewPostAct newPostAct = this.f40690F;
            Objects.requireNonNull(newPostAct);
            c11245a.m62755Q0(new r440(newPostAct));
            return;
        }
        if ((TextUtils.isEmpty(m62908n0()) && ((!NullChecker.m81304b(arrayListM62777g1) || arrayListM62777g1.size() == 0 || (TextUtils.isEmpty(arrayListM62777g1.get(0).originUrl) && TextUtils.isEmpty(arrayListM62777g1.get(0).url))) && this.f40693I.m62747I1())) || this.f40693I.f40664g || TextUtils.equals("immersion_cartoon_effects", ((NewPostAct) getAct()).f40620c) || TextUtils.equals("immersion", ((NewPostAct) getAct()).f40620c) || "share".equals(((NewPostAct) getAct()).f40620c) || "from_h5_moment_level_open_camera".equals(((NewPostAct) getAct()).f40620c)) {
            this.f40690F.m62689e2();
        } else {
            wng.m204695v().m204731j0();
            new xh0.C21150a(this.f40690F).m208730i(R$string.f38917J1).m208738q(R$string.f39007Y1).m208736o(new View.OnClickListener() { // from class: l.c540
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79337a.m62898h1(view);
                }
            }).m208726e(R$string.f39143s1).m208724c(new View.OnClickListener() { // from class: l.n540
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f137186a.m62901j1(view);
                }
            }).m208722a().m208721g();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public List<TopicMoment> m62920t0() {
        return this.f40685A.getTopicList();
    }

    /* JADX INFO: renamed from: t1 */
    public boolean m62921t1() {
        if (this.f40693I.f40654E) {
            return false;
        }
        Editable text = this.f40714g.getText();
        eqg eqgVar = this.f40706V;
        if (eqgVar != null) {
            text = eqgVar.m117749k(text);
        }
        final String string = text.toString();
        boolean zIsEmpty = TextUtils.isEmpty(string);
        C11245a c11245a = this.f40693I;
        if (zIsEmpty) {
            return c11245a.m62749L1(string, this.f40694J);
        }
        c11245a.m62770Y0(string, new d30() { // from class: l.v540
            @Override // p149l.d30
            public final void call() {
                this.f180001a.m62903k1(string);
            }
        });
        return false;
    }

    /* JADX INFO: renamed from: u0 */
    public final boolean m62922u0() {
        return PermissionHelper.m79881b("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* JADX INFO: renamed from: u1 */
    public void m62923u1(NewMomentDraft newMomentDraft) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(newMomentDraft.text)) {
            this.f40702R = true;
            if (NullChecker.m81303a(this.f40706V)) {
                spannableStringBuilder.append((CharSequence) this.f40706V.m117748j(newMomentDraft.text));
            } else {
                spannableStringBuilder.append((CharSequence) eqg.m117739a(newMomentDraft.text));
            }
            this.f40714g.setText(spannableStringBuilder);
            this.f40714g.setSelection(Math.min(spannableStringBuilder.length(), this.f40697M));
        }
        if (!m62922u0() && !vwb.m200296J(newMomentDraft.images)) {
            for (Media media : newMomentDraft.images) {
                if (!TextUtils.isEmpty(media.originUrl) && !media.originUrl.contains("com.p1.mobile.putong/cache/.tantan") && !media.originUrl.contains("com.p1.mobile.putong/files/moment")) {
                    return;
                }
            }
        }
        m62849E1(newMomentDraft);
        if (newMomentDraft.images.size() > 0) {
            m62929y0(false);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public void m62924v0(float f, float f2) {
        this.f40685A.m63014H0(f2, m62853H0(f, f2));
    }

    /* JADX INFO: renamed from: v1 */
    public void m62925v1() {
        if (m62915q1() && this.f40696L) {
            m62897h0();
        }
        this.f40696L = false;
        if (NullChecker.m81303a(this.f40698N)) {
            m62849E1(this.f40698N);
            this.f40698N = null;
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m62926w0() {
        if (NullChecker.m81304b(this.f40714g)) {
            this.f40714g.clearFocus();
            this.f40690F.hideInput(this.f40714g);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public void m62927w1(String str, List<TopicMoment> list) {
        if (nkg.m159899p0() && NullChecker.m81303a(this.f40693I) && NullChecker.m81303a(this.f40693I.f40662e)) {
            for (final TopicMoment topicMoment : list) {
                topicMoment.selected = vwb.m200337m(this.f40693I.f40662e, new w9j() { // from class: l.o540
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((TopicMoment) obj).f39247id.equals(topicMoment.f39247id));
                    }
                });
            }
        }
        this.f40685A.m63043p1(str, list);
    }

    /* JADX INFO: renamed from: x0 */
    public void m62928x0() {
        m62929y0(m62922u0());
    }

    /* JADX INFO: renamed from: y0 */
    public final void m62929y0(boolean z) {
        this.f40685A.m63024M1(Integer.valueOf(this.f40688D));
        this.f40685A.m63013G1(z);
        if (z) {
            return;
        }
        e51.m114743H(getAct(), new Runnable() { // from class: l.p540
            @Override // java.lang.Runnable
            public final void run() {
                this.f147256a.m62871S0();
            }
        }, 50L);
    }

    /* JADX INFO: renamed from: y1 */
    public void m62930y1(List<TopicMoment> list) {
        m62927w1("", list);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m62931z0() {
        if (this.f40690F.getIntent().getBooleanExtra("extra_show_audio_input", false)) {
            this.f40685A.m63039k1(false);
        }
    }

    /* JADX INFO: renamed from: z1 */
    public void m62932z1(ArrayList<Media> arrayList) {
        this.f40685A.m63044q1(arrayList);
    }
}
