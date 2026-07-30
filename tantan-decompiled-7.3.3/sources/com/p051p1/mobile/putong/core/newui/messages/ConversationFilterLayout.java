package com.p051p1.mobile.putong.core.newui.messages;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.data.ChatMM;
import com.p051p1.mobile.putong.core.data.ChatRoundsDisplayedExternallyConfig;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.LabelParams;
import com.p051p1.mobile.putong.core.data.MessageFilterConfig;
import com.p051p1.mobile.putong.core.newui.messages.ConversationFilterLayout;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.bsj0;
import p153l.gra;
import p153l.gt0;
import p153l.ht0;
import p153l.i4g0;
import p153l.jyb;
import p153l.kcg0;
import p153l.l51;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.u76;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vg60;
import p153l.w76;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationFilterLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f25440a;

    /* JADX INFO: renamed from: b */
    public VText f25441b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f25442c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f25443d;

    /* JADX INFO: renamed from: e */
    public final Set<String> f25444e;

    /* JADX INFO: renamed from: f */
    public DbLinks f25445f;

    /* JADX INFO: renamed from: g */
    public kcg0 f25446g;

    /* JADX INFO: renamed from: h */
    public kcg0 f25447h;

    /* JADX INFO: renamed from: i */
    public w76 f25448i;

    /* JADX INFO: renamed from: j */
    public MessageFilterConfig f25449j;

    /* JADX INFO: renamed from: k */
    public String f25450k;

    /* JADX INFO: renamed from: l */
    public Runnable f25451l;

    /* JADX INFO: renamed from: m */
    public ConversationsList f25452m;

    /* JADX INFO: renamed from: n */
    public final y20<String> f25453n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationFilterLayout$a */
    public class C8260a extends RecyclerView.AbstractC0578n {
        public C8260a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            super.getItemOffsets(rect, view, recyclerView, c0561a0);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.left = qa00.f156323j;
            } else {
                rect.left = qa00.f156321h;
            }
            if (NullChecker.m82486a(ConversationFilterLayout.this.f25449j) && childAdapterPosition == c0561a0.m3361c() - 1) {
                if (gra.m131672d3()) {
                    rect.right = qa00.f156333t;
                } else {
                    rect.right = qa00.f156323j;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationFilterLayout$b */
    public class C8261b extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f25455a;

        public C8261b(Runnable runnable) {
            this.f25455a = runnable;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            this.f25455a.run();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationFilterLayout$c */
    public class C8262c implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f25457a;

        public C8262c(Runnable runnable) {
            this.f25457a = runnable;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            this.f25457a.run();
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
        }
    }

    public ConversationFilterLayout(@NonNull Context context) {
        super(context);
        this.f25444e = new HashSet();
        this.f25445f = null;
        this.f25450k = "";
        this.f25453n = new y20() { // from class: l.i76
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113237a.m41716O((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m41685g(Throwable th) {
    }

    private View getOnlineAllView() {
        int iM147476G;
        if (!NullChecker.m82486a(this.f25448i) || this.f25440a.getChildCount() <= (iM147476G = jyb.m147476G(this.f25448i.m205230G(), new qcj() { // from class: l.x66
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LabelParams) obj).key, "onlineAll"));
            }
        }))) {
            return null;
        }
        return this.f25440a.getChildAt(iM147476G);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m41690l(View view) {
        bnl0.m105524M(view, true);
        CoreModule.f18264c.f20381e0.f89271l1.put(Long.valueOf(pzi0.m174454o()));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m41693o(View view) {
    }

    /* JADX INFO: renamed from: A */
    public boolean m41702A(Conversation conversation, User user) {
        if (conversation == null || user == null || user.isBanedOrInactivated() || !(TEnum.equals(conversation.status, "default") || TEnum.equals(conversation.status, "blocked"))) {
            return false;
        }
        for (String str : this.f25444e) {
            if (!TextUtils.isEmpty(str) && !m41703B(str, conversation, user)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: B */
    public boolean m41703B(String str, Conversation conversation, User user) {
        str.getClass();
        switch (str) {
            case "sentMessage":
                return conversation.userMessageCount > 0;
            case "nearby":
                return !user.isHideLocationFromSVip() && user.location.distance <= 20000;
            case "online":
            case "onlineAll":
                return CoreModule.f18264c.f20330N0.m32970k3(user, 5);
            case "unread":
                if (conversation.unreadMessages <= 0) {
                    return false;
                }
                return (gra.m131626S2() && conversation.f56859id.startsWith("-") && !TextUtils.equals(User.ID_LIVE_VIP_SERVICE, conversation.f56859id)) ? false : true;
            case "picture":
                return user.isPicVerificationVerified();
            case "closefriend":
                if (NullChecker.m82486a(conversation.additional) && NullChecker.m82486a(conversation.additional.chatMM)) {
                    ChatMM chatMM = conversation.additional.chatMM;
                    if (chatMM.partnerSwitch && chatMM.level >= 3) {
                        return true;
                    }
                }
                return false;
            case "newMatch":
                return conversation.localEverHasMessage && !conversation.localHasMessage && TextUtils.isEmpty(conversation.readUntil);
            case "superLikeMe":
                return m41719R(user);
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m41704C() {
        View onlineAllView = getOnlineAllView();
        if (onlineAllView == null) {
            return;
        }
        final View viewFindViewById = onlineAllView.findViewById(adc0.f69906G);
        final ColorTrackTextView colorTrackTextView = (ColorTrackTextView) onlineAllView.findViewById(adc0.f70673z6);
        final SVGAnimationView sVGAnimationView = (SVGAnimationView) onlineAllView.findViewById(adc0.f70407jc);
        final int width = onlineAllView.getWidth();
        m41721T(viewFindViewById, colorTrackTextView, width, true, new Runnable() { // from class: l.e76
            @Override // java.lang.Runnable
            public final void run() {
                this.f92403a.m41711J(sVGAnimationView, viewFindViewById, colorTrackTextView, width);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public void m41705D(ConversationsList conversationsList, Runnable runnable, final Runnable runnable2) {
        this.f25451l = runnable;
        this.f25452m = conversationsList;
        y20 y20Var = new y20() { // from class: l.n76
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140578a.m41712K((String) obj);
            }
        };
        final Set<String> set = this.f25444e;
        Objects.requireNonNull(set);
        w76 w76Var = new w76(y20Var, new qcj() { // from class: l.o76
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(set.contains((String) obj));
            }
        });
        this.f25448i = w76Var;
        this.f25440a.setAdapter(w76Var);
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(this.f25449j) && !jyb.m147479J(this.f25449j.filterTabList)) {
            arrayList.addAll(this.f25449j.filterTabList);
        }
        if (jyb.m147479J(arrayList)) {
            bnl0.m105524M(this.f25440a, false);
        } else {
            List<LabelParams> listM41720S = m41720S();
            if (!jyb.m147479J(listM41720S)) {
                arrayList = new ArrayList(listM41720S);
                if (!CoreModule.f18264c.f20381e0.f89377z6.get().booleanValue()) {
                    jyb.m147503d0(arrayList, new qcj() { // from class: l.p76
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TextUtils.equals(((LabelParams) obj).key, "closefriend"));
                        }
                    });
                }
            }
            LabelParams labelParamsM131747s3 = gra.m131747s3();
            if (NullChecker.m82486a(labelParamsM131747s3)) {
                jyb.m147503d0(arrayList, new qcj() { // from class: l.q76
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((LabelParams) obj).key, "online"));
                    }
                });
                arrayList.add(0, labelParamsM131747s3);
            }
            this.f25448i.m205233J(arrayList);
        }
        if (!gra.m131672d3() || !NullChecker.m82486a(runnable2)) {
            bnl0.m105524M(this.f25442c, false);
            bnl0.m105539W(this.f25440a, 0);
        } else {
            bnl0.m105524M(this.f25442c, true);
            bnl0.m105509E0(this.f25443d, new View.OnClickListener() { // from class: l.r76
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable2.run();
                }
            });
            bnl0.m105539W(this.f25440a, qa00.f156338y);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m41706E() {
        this.f25449j = gra.m131774y0();
        this.f25441b.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f25440a.setLayoutManager(linearLayoutManager);
        this.f25440a.addItemDecoration(new C8260a());
    }

    /* JADX INFO: renamed from: F */
    public boolean m41707F() {
        return !this.f25444e.isEmpty();
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m41708G(ConversationsList.C8281e c8281e, List list) {
        if (this.f25444e.isEmpty()) {
            return;
        }
        int iMin = Math.min(list.size(), 20);
        ArrayList arrayList = new ArrayList();
        List<Conversation> listMo42531k = c8281e.mo42531k();
        for (int i = 0; i < iMin; i++) {
            final Conversation conversation = (Conversation) list.get(i);
            if (m41702A(conversation, CoreModule.f18264c.f20381e0.m116597oa(conversation.f56859id))) {
                int iM147476G = jyb.m147476G(listMo42531k, new qcj() { // from class: l.k76
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((Conversation) obj).f56859id, conversation.f56859id));
                    }
                });
                if (iM147476G >= 0) {
                    listMo42531k.remove(iM147476G);
                }
                arrayList.add(conversation);
            }
        }
        if (NullChecker.m82486a(listMo42531k) && !jyb.m147479J(arrayList)) {
            listMo42531k.addAll(0, arrayList);
        }
        c8281e.notifyDataSetChanged();
        m41725z(c8281e);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m41709H(View view, ColorTrackTextView colorTrackTextView) {
        bnl0.m105507D0(0, view);
        bnl0.m105524M(view, false);
        colorTrackTextView.setProgress(0.0f);
        this.f25448i.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m41710I(SVGAnimationView sVGAnimationView, final View view, final ColorTrackTextView colorTrackTextView, int i) {
        bnl0.m105524M(sVGAnimationView, false);
        m41721T(view, colorTrackTextView, i, false, new Runnable() { // from class: l.l76
            @Override // java.lang.Runnable
            public final void run() {
                this.f130322a.m41709H(view, colorTrackTextView);
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m41711J(final SVGAnimationView sVGAnimationView, final View view, final ColorTrackTextView colorTrackTextView, final int i) {
        Runnable runnable = new Runnable() { // from class: l.g76
            @Override // java.lang.Runnable
            public final void run() {
                this.f102510a.m41710I(sVGAnimationView, view, colorTrackTextView, i);
            }
        };
        bnl0.m105524M(sVGAnimationView, true);
        SVGALoader.with(getContext()).loadCallback(new C8262c(runnable)).from("https://auto.tancdn.com/v1/raw/6298bf34-85f1-47a4-83ad-43dd96fcb6e114.svga").autoPlay(true).animListener(new C8261b(runnable)).repeatCount(1).into(sVGAnimationView);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m41712K(String str) {
        i4g0.m138523u("e_fast_filtrate", OMSDialogPositon.p_messages_view, pf60.m172085a("filtrate_tag", str), pf60.m172085a("tag_state", Integer.valueOf(!this.f25444e.contains(str) ? 1 : 0)));
        this.f25453n.call(str);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m41713L(String str, ConversationsList.C8281e c8281e, boolean z, vg60 vg60Var) {
        if (TextUtils.equals(getTabFilter(), str)) {
            if (gra.m131626S2()) {
                jyb.m147503d0(vg60Var.f184001a, new qcj() { // from class: l.z66
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        Conversation conversation = (Conversation) obj;
                        return Boolean.valueOf(!TextUtils.equals(User.ID_LIVE_VIP_SERVICE, conversation.f56859id) && conversation.f56859id.startsWith("-"));
                    }
                });
            }
            this.f25445f = vg60Var.f184002b;
            c8281e.m42524M(vg60Var.f184001a, z);
            m41725z(c8281e);
        }
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m41714M(Throwable th) {
        this.f25450k = "";
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m41715N() {
        if (NullChecker.m82486a(this.f25451l)) {
            this.f25451l.run();
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m41716O(String str) {
        boolean zContains = this.f25444e.contains(str);
        Set<String> set = this.f25444e;
        if (zContains) {
            set.remove(str);
        } else {
            set.add(str);
        }
        if (TextUtils.equals(str, "onlineAll")) {
            CoreModule.f18264c.f20381e0.f89271l1.put(-1L);
        }
        i4g0.m138492A("e_fast_filtrate", OMSDialogPositon.p_messages_view, pf60.m172085a("filtrate_tag", getTabFilter()));
        this.f25448i.notifyDataSetChanged();
        if (jyb.m147479J(this.f25444e)) {
            CoreModule.f18264c.f20384f0.f20708p2.onNext(uxj0.f181467a);
            psd0.m173633z(this.f25447h);
        } else {
            m41718Q(this.f25452m.getConversationsAdapter(), false);
        }
        l51.m152886F(getContext(), new Runnable() { // from class: l.s76
            @Override // java.lang.Runnable
            public final void run() {
                this.f166647a.m41715N();
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m41717P(vg60 vg60Var) {
        if (jyb.m147479J(vg60Var.f184001a) || jyb.m147479J(jyb.m147522n(vg60Var.f184001a, new qcj() { // from class: l.f76
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Conversation) obj).f21116mm < 1);
            }
        }))) {
            m41704C();
        } else {
            CoreModule.f18264c.f20381e0.f89271l1.put(Long.valueOf(pzi0.m174454o()));
            this.f25453n.call("onlineAll");
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m41718Q(final ConversationsList.C8281e c8281e, final boolean z) {
        String str;
        if (z) {
            DbLinks dbLinks = this.f25445f;
            if (dbLinks == null || TextUtils.isEmpty(dbLinks.links.next)) {
                return;
            }
        } else {
            this.f25445f = null;
        }
        final String tabFilter = getTabFilter();
        StringBuilder sb = new StringBuilder();
        sb.append(C4879a.m32199F(tabFilter));
        if (z) {
            str = "&" + this.f25445f.links.next;
        } else {
            str = "";
        }
        sb.append(str);
        String string = sb.toString();
        if (TextUtils.equals(this.f25450k, string)) {
            return;
        }
        this.f25450k = string;
        psd0.m173633z(this.f25446g);
        this.f25446g = ((Act) getContext()).duringCreated(CoreModule.f18264c.f20384f0.m34043mg(string)).subscribe(psd0.m173597H(new y20() { // from class: l.t76
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172400a.m41713L(tabFilter, c8281e, z, (vg60) obj);
            }
        }, new y20() { // from class: l.y66
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197630a.m41714M((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public boolean m41719R(User user) {
        if (user == null || user.f56859id.equals(uqb0.f180397c0.userId()) || user.isTeamAccount() || !NullChecker.m82486a(user.localRelationship) || !NullChecker.m82486a(user.localRelationship.relationshipExtensions)) {
            return false;
        }
        return TEnum.equals(user.localRelationship.relationshipExtensions.otherRelationType, RelationshipStatus.SUPERLIKED);
    }

    /* JADX INFO: renamed from: S */
    public final List<LabelParams> m41720S() {
        ChatRoundsDisplayedExternallyConfig chatRoundsDisplayedExternallyConfigM131611P = gra.m131611P();
        if (NullChecker.m82486a(chatRoundsDisplayedExternallyConfigM131611P) && chatRoundsDisplayedExternallyConfigM131611P.enabled && !jyb.m147479J(chatRoundsDisplayedExternallyConfigM131611P.filterTabList)) {
            return chatRoundsDisplayedExternallyConfigM131611P.filterTabList;
        }
        return null;
    }

    /* JADX INFO: renamed from: T */
    public final void m41721T(final View view, final ColorTrackTextView colorTrackTextView, int i, boolean z, @NonNull Runnable runnable) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = z ? 8388611 : 8388613;
        view.setLayoutParams(layoutParams);
        int color = Color.parseColor("#33000000");
        if (z) {
            colorTrackTextView.m41604t(color, -1);
        } else {
            colorTrackTextView.m41604t(-1, color);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.h76
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                colorTrackTextView.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat.start();
        Property<View, Integer> property = ht0.f111498n;
        int i2 = z ? 0 : i;
        if (!z) {
            i = 0;
        }
        animatorSet.playTogether(gt0.m132169o(view, property, i2, i), valueAnimatorOfFloat);
        animatorSet.setDuration(400L);
        gt0.m132176v(animatorSet, new Runnable() { // from class: l.j76
            @Override // java.lang.Runnable
            public final void run() {
                ConversationFilterLayout.m41690l(view);
            }
        });
        gt0.m132161g(animatorSet, runnable, runnable);
        animatorSet.start();
    }

    /* JADX INFO: renamed from: U */
    public void m41722U() {
        if (gra.m131767w3() && !CoreModule.f18264c.f20381e0.m116593na().isFemale()) {
            ((Act) getContext()).duringCreated(CoreModule.f18264c.f20384f0.m34043mg(C4879a.m32199F("onlineAll"))).subscribe(psd0.m173597H(new y20() { // from class: l.a76
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f68792a.m41717P((vg60) obj);
                }
            }, new y20() { // from class: l.b76
                @Override // p153l.y20
                public final void call(Object obj) {
                    ConversationFilterLayout.m41685g((Throwable) obj);
                }
            }));
        } else if (gra.m131762v3()) {
            m41704C();
        }
    }

    public String getTabFilter() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f25444e) {
            if (TextUtils.isEmpty(sb)) {
                sb.append(str);
            } else {
                sb.append(Constants.SEPARATOR_COMMA);
                sb.append(str);
            }
        }
        return sb.toString();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41723x(this);
        m41706E();
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.m76
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationFilterLayout.m41693o(view);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final void m41723x(View view) {
        u76.m194836a(this, view);
    }

    /* JADX INFO: renamed from: y */
    public boolean m41724y(int i, String str) {
        psd0.m173633z(this.f25447h);
        this.f25450k = "";
        boolean z = true;
        if (i == 0) {
            boolean z2 = NullChecker.m82486a(this.f25449j) && !jyb.m147479J(this.f25449j.filterTabList);
            bnl0.m105524M(this.f25440a, z2);
            VText vText = this.f25441b;
            if (z2) {
                bnl0.m105524M(vText, false);
                this.f25441b.setText("");
            } else {
                bnl0.m105524M(vText, true);
                this.f25441b.setText(getResources().getString(R$string.f19172d2));
            }
        } else {
            bnl0.m105524M(this.f25440a, false);
            bnl0.m105524M(this.f25441b, true);
            this.f25441b.setText(str);
        }
        if (this.f25444e.isEmpty()) {
            z = false;
        } else {
            this.f25440a.scrollToPosition(0);
            this.f25444e.clear();
            CoreModule.f18264c.f20384f0.f20708p2.onNext(uxj0.f181467a);
            if (NullChecker.m82486a(this.f25451l)) {
                this.f25451l.run();
            }
        }
        if (NullChecker.m82486a(this.f25448i)) {
            this.f25448i.notifyDataSetChanged();
        }
        return z;
    }

    /* JADX INFO: renamed from: z */
    public final void m41725z(final ConversationsList.C8281e c8281e) {
        psd0.m173633z(this.f25447h);
        this.f25447h = ((Act) getContext()).duringCreated(CoreModule.f18264c.f20384f0.m33811Te().filter(new qcj() { // from class: l.c76
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        }).onBackpressureLatest()).subscribe(psd0.m173596G(new y20() { // from class: l.d76
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85457a.m41708G(c8281e, (List) obj);
            }
        }));
    }

    public ConversationFilterLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25444e = new HashSet();
        this.f25445f = null;
        this.f25450k = "";
        this.f25453n = new y20() { // from class: l.i76
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113237a.m41716O((String) obj);
            }
        };
    }

    public ConversationFilterLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25444e = new HashSet();
        this.f25445f = null;
        this.f25450k = "";
        this.f25453n = new y20() { // from class: l.i76
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113237a.m41716O((String) obj);
            }
        };
    }
}
