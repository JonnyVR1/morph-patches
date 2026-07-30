package com.p046p1.mobile.putong.live.livingroom.virtual.chat;

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
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p149l.apl0;
import p149l.e0o0;
import p149l.e30;
import p149l.e51;
import p149l.fbp0;
import p149l.fhm0;
import p149l.j760;
import p149l.s7m;
import p149l.t100;
import p149l.vol0;
import p149l.vwb;
import p149l.xdl0;
import p149l.zol0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualChatInputTipsView extends LiveFadeRecyclerView implements s7m<vol0> {

    /* JADX INFO: renamed from: k */
    public static String f52281k = "fixed_bottom";

    /* JADX INFO: renamed from: l */
    public static String f52282l = "chat_input";

    /* JADX INFO: renamed from: f */
    public VirtualChatInputTipsView f52283f;

    /* JADX INFO: renamed from: g */
    public LiveBaseAdapter f52284g;

    /* JADX INFO: renamed from: h */
    public LinearLayoutManager f52285h;

    /* JADX INFO: renamed from: i */
    public vol0 f52286i;

    /* JADX INFO: renamed from: j */
    public HashSet<Integer> f52287j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.chat.VirtualChatInputTipsView$a */
    public class C12954a extends RecyclerView.AbstractC0576n {
        public C12954a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            super.getItemOffsets(rect, view, recyclerView, c0588z);
            if (recyclerView.getChildViewHolder(view).getAdapterPosition() > 0) {
                rect.left = t100.m186890d(6.0f);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.chat.VirtualChatInputTipsView$b */
    public class C12955b extends RecyclerView.AbstractC0582t {
        public C12955b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                VirtualChatInputTipsView.this.m76925U();
            }
        }
    }

    public VirtualChatInputTipsView(Context context) {
        super(context);
        this.f52287j = new HashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U */
    public void m76925U() {
        if (getLayoutManager() == null || this.f52286i == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        int itemCount = this.f52284g.getItemCount();
        if (iFindFirstVisibleItemPosition < 0 || iFindLastVisibleItemPosition >= itemCount) {
            return;
        }
        while (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
            if (!this.f52287j.contains(Integer.valueOf(iFindFirstVisibleItemPosition))) {
                zvf0.m220368A("e_audio_shortcut_msg", fbp0.m120390f(((fhm0) this.f52286i.m206027E2()).mo97490p()), j760.m140076a("message_content", ((apl0) this.f52284g.m67355J().get(iFindFirstVisibleItemPosition)).f71062b), j760.m140076a("user_type", e0o0.m114325l(this.f52286i)));
                this.f52287j.add(Integer.valueOf(iFindFirstVisibleItemPosition));
            }
            iFindFirstVisibleItemPosition++;
        }
    }

    /* JADX INFO: renamed from: r */
    private void m76926r() {
        addItemDecoration(new C12954a());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        this.f52285h = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f52284g = liveBaseAdapter;
        setAdapter(liveBaseAdapter);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: M */
    public final void m76927M(View view) {
        zol0.m219565a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(vol0 vol0Var) {
        this.f52286i = vol0Var;
    }

    /* JADX INFO: renamed from: O */
    public void m76929O() {
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m76930P(e30 e30Var, String str, View view) {
        m76932R(e30Var, str);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m76931Q(String str, final e30 e30Var, List list, final String str2) {
        apl0 apl0Var = new apl0(str2, str);
        apl0Var.mo109662A(new View.OnClickListener() { // from class: l.yol0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199309a.m76930P(e30Var, str2, view);
            }
        });
        list.add(apl0Var);
    }

    /* JADX INFO: renamed from: R */
    public final void m76932R(e30<String> e30Var, String str) {
        if (e30Var != null) {
            e30Var.call(str);
        }
        xdl0.m208344M(this.f52283f, false);
    }

    /* JADX INFO: renamed from: S */
    public final void m76933S() {
        clearOnScrollListeners();
        addOnScrollListener(new C12955b());
    }

    /* JADX INFO: renamed from: T */
    public void m76934T(List<String> list, final String str, final e30<String> e30Var) {
        if (vwb.m200296J(list)) {
            xdl0.m208344M(this, false);
            return;
        }
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.wol0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187436a.m76931Q(str, e30Var, arrayList, (String) obj);
            }
        });
        this.f52284g.m67371Z(arrayList);
        if (f52281k.equals(str)) {
            m76933S();
        }
        e51.m114742G(new Runnable() { // from class: l.xol0
            @Override // java.lang.Runnable
            public final void run() {
                this.f193854a.m76925U();
            }
        });
        xdl0.m208344M(this, true);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76927M(this);
        m76926r();
    }

    public VirtualChatInputTipsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52287j = new HashSet<>();
    }

    public VirtualChatInputTipsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52287j = new HashSet<>();
    }
}
