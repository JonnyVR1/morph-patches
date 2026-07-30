package com.p051p1.mobile.putong.live.livingroom.virtual.chat;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p051p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p153l.bnl0;
import p153l.dyl0;
import p153l.eyl0;
import p153l.i4g0;
import p153l.i9o0;
import p153l.iam;
import p153l.jkp0;
import p153l.jqm0;
import p153l.jyb;
import p153l.l51;
import p153l.pf60;
import p153l.qa00;
import p153l.y20;
import p153l.zxl0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualChatInputTipsView extends LiveFadeRecyclerView implements iam<zxl0> {

    /* JADX INFO: renamed from: k */
    public static String f53129k = "fixed_bottom";

    /* JADX INFO: renamed from: l */
    public static String f53130l = "chat_input";

    /* JADX INFO: renamed from: f */
    public VirtualChatInputTipsView f53131f;

    /* JADX INFO: renamed from: g */
    public LiveBaseAdapter f53132g;

    /* JADX INFO: renamed from: h */
    public LinearLayoutManager f53133h;

    /* JADX INFO: renamed from: i */
    public zxl0 f53134i;

    /* JADX INFO: renamed from: j */
    public HashSet<Integer> f53135j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.chat.VirtualChatInputTipsView$a */
    public class C13117a extends RecyclerView.AbstractC0578n {
        public C13117a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            super.getItemOffsets(rect, view, recyclerView, c0561a0);
            if (recyclerView.getChildViewHolder(view).getAdapterPosition() > 0) {
                rect.left = qa00.m175859d(6.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.chat.VirtualChatInputTipsView$b */
    public class C13118b extends RecyclerView.AbstractC0584t {
        public C13118b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                VirtualChatInputTipsView.this.m78108U();
            }
        }
    }

    public VirtualChatInputTipsView(Context context) {
        super(context);
        this.f53135j = new HashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    public void m78108U() {
        if (getLayoutManager() == null || this.f53134i == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        int itemCount = this.f53132g.getItemCount();
        if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition >= itemCount) {
            return;
        }
        while (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
            if (!this.f53135j.contains(Integer.valueOf(iFindFirstVisibleItemPosition))) {
                i4g0.m138492A("e_audio_shortcut_msg", jkp0.m145875f(((jqm0) this.f53134i.m213810E2()).mo118373p()), pf60.m172085a("message_content", ((eyl0) this.f53132g.m68538J().get(iFindFirstVisibleItemPosition)).f96453b), pf60.m172085a("user_type", i9o0.m139140l(this.f53134i)));
                this.f53135j.add(Integer.valueOf(iFindFirstVisibleItemPosition));
            }
            iFindFirstVisibleItemPosition++;
        }
    }

    /* JADX INFO: renamed from: r */
    private void m78109r() {
        addItemDecoration(new C13117a());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.f53133h = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f53132g = liveBaseAdapter;
        setAdapter(liveBaseAdapter);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: M */
    public final void m78110M(View view) {
        dyl0.m118703a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(zxl0 zxl0Var) {
        this.f53134i = zxl0Var;
    }

    /* JADX INFO: renamed from: O */
    public void m78112O() {
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m78113P(y20 y20Var, String str, View view) {
        m78115R(y20Var, str);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m78114Q(String str, final y20 y20Var, List list, final String str2) {
        eyl0 eyl0Var = new eyl0(str2, str);
        eyl0Var.mo113881A(new View.OnClickListener() { // from class: l.cyl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84389a.m78113P(y20Var, str2, view);
            }
        });
        list.add(eyl0Var);
    }

    /* JADX INFO: renamed from: R */
    public final void m78115R(y20<String> y20Var, String str) {
        if (y20Var != null) {
            y20Var.call(str);
        }
        bnl0.m105524M(this.f53131f, false);
    }

    /* JADX INFO: renamed from: S */
    public final void m78116S() {
        clearOnScrollListeners();
        addOnScrollListener(new C13118b());
    }

    /* JADX INFO: renamed from: T */
    public void m78117T(List<String> list, final String str, final y20<String> y20Var) {
        if (jyb.m147479J(list)) {
            bnl0.m105524M(this, false);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.ayl0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73979a.m78114Q(str, y20Var, arrayList, (String) obj);
            }
        });
        this.f53132g.m68554Z(arrayList);
        if (f53129k.equals(str)) {
            m78116S();
        }
        l51.m152887G(new Runnable() { // from class: l.byl0
            @Override // java.lang.Runnable
            public final void run() {
                this.f79032a.m78108U();
            }
        });
        bnl0.m105524M(this, true);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78110M(this);
        m78109r();
    }

    public VirtualChatInputTipsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53135j = new HashSet<>();
    }

    public VirtualChatInputTipsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53135j = new HashSet<>();
    }
}
