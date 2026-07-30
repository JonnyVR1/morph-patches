package p149l;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.ChatPartnersHistoryItem;
import com.p046p1.mobile.putong.core.newui.partner.ChatPartnerHistoryAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class e05 implements s7m<b05> {

    /* JADX INFO: renamed from: a */
    public VFrame f88536a;

    /* JADX INFO: renamed from: b */
    public VImage f88537b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f88538c;

    /* JADX INFO: renamed from: d */
    public VLinear f88539d;

    /* JADX INFO: renamed from: e */
    public ChatPartnerHistoryAct f88540e;

    /* JADX INFO: renamed from: f */
    public b05 f88541f;

    /* JADX INFO: renamed from: g */
    public C16512b f88542g;

    /* JADX INFO: renamed from: l.e05$a */
    public class C16511a extends dac0<User> {

        /* JADX INFO: renamed from: c */
        public final List<User> f88543c;

        public C16511a(List<User> list) {
            ArrayList arrayList = new ArrayList();
            this.f88543c = arrayList;
            arrayList.addAll(list);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int mo28824C() {
            return this.f88543c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(e05.this.getContext()).inflate(f6c0.f95803h1, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final User user, int i, int i2) {
            int iM186890d = (t100.m186890d(30.0f) * xdl0.m208412y0()) / t100.m186890d(375.0f);
            xdl0.m208327D0(iM186890d, view);
            xdl0.m208325C0(view, iM186890d);
            qib0.f154691G.m102331L0((VDraweeView) view, user.m60124fp().profileSmall().formatted());
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.d05
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f83148a.m114166H(user, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public User getItem(int i) {
            return this.f88543c.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m114166H(User user, View view) {
            zvf0.m220396r("e_chat_avatar", e05.this.act().pageId());
            lva.m151843D(e05.this.act(), Uri.parse(String.format("tantanapp://jumpChat?uid=%s", user.f56011id)));
        }
    }

    /* JADX INFO: renamed from: l.e05$b */
    public class C16512b extends dac0<ChatPartnersHistoryItem> {

        /* JADX INFO: renamed from: c */
        public List<ChatPartnersHistoryItem> f88545c;

        public C16512b() {
            this.f88545c = new ArrayList();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int mo28824C() {
            return this.f88545c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(e05.this.getContext()).inflate(f6c0.f95820i1, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, ChatPartnersHistoryItem chatPartnersHistoryItem, int i, int i2) {
            VText vText = (VText) view.findViewById(u4c0.f174268ge);
            VText vText2 = (VText) view.findViewById(u4c0.f174133Yd);
            VRecyclerView vRecyclerView = (VRecyclerView) view.findViewById(u4c0.f174176b7);
            VText vText3 = (VText) view.findViewById(u4c0.f174374n2);
            vText.setText(chatPartnersHistoryItem.messageValue);
            vText2.setText(new g7c("yyyy.MM.dd HH.mm", Locale.getDefault()).m124687a().format(Double.valueOf(chatPartnersHistoryItem.createdTime)));
            vText3.setText(String.format(Locale.CHINA, "找到%d个好友", Integer.valueOf(chatPartnersHistoryItem.userIds.size())));
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = chatPartnersHistoryItem.userIds.iterator();
            while (it.hasNext()) {
                User userM99742l0 = e05.this.f88541f.m99742l0(it.next());
                if (NullChecker.m81303a(userM99742l0)) {
                    arrayList.add(userM99742l0);
                }
            }
            vRecyclerView.setAdapter(e05.this.new C16511a(arrayList));
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public ChatPartnersHistoryItem getItem(int i) {
            return this.f88545c.get(i);
        }

        /* JADX INFO: renamed from: G */
        public void m114169G(List<ChatPartnersHistoryItem> list) {
            this.f88545c = list;
            notifyDataSetChanged();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: e */
        public void mo47327e(int i) {
            if (this.f88545c.size() <= 0 || this.f88545c.size() - i >= 3) {
                return;
            }
            e05.this.f88541f.m99740b();
        }
    }

    public e05(ChatPartnerHistoryAct chatPartnerHistoryAct) {
        this.f88540e = chatPartnerHistoryAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m114158e(View view) {
        act().m66873d2();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f88540e;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f88540e;
    }

    /* JADX INFO: renamed from: c */
    public View m114159c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g05.m123949b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(b05 b05Var) {
        this.f88541f = b05Var;
    }

    /* JADX INFO: renamed from: f */
    public void m114161f(List<ChatPartnersHistoryItem> list) {
        xdl0.m208344M(this.f88539d, vwb.m200296J(list));
        this.f88542g.m114169G(list);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m114159c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m114162r() {
        xdl0.m208329E0(this.f88537b, new View.OnClickListener() { // from class: l.c05
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78115a.m114158e(view);
            }
        });
        C16512b c16512b = new C16512b();
        this.f88542g = c16512b;
        this.f88538c.setAdapter(c16512b);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
