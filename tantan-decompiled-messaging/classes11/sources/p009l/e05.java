package p009l;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.partner.ChatPartnerHistoryAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.ChatPartnersHistoryItem;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l.dac0;
import l.f6c0;
import l.g05;
import l.lva;
import l.qib0;
import l.s7m;
import l.t100;
import l.u4c0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class e05 implements s7m<b05> {

    /* JADX INFO: renamed from: a */
    public VFrame f12077a;

    /* JADX INFO: renamed from: b */
    public VImage f12078b;

    /* JADX INFO: renamed from: c */
    public VRecyclerView f12079c;

    /* JADX INFO: renamed from: d */
    public VLinear f12080d;

    /* JADX INFO: renamed from: e */
    public ChatPartnerHistoryAct f12081e;

    /* JADX INFO: renamed from: f */
    public b05 f12082f;

    /* JADX INFO: renamed from: g */
    public C0863b f12083g;

    /* JADX INFO: renamed from: l.e05$a */
    public class C0862a extends dac0<User> {

        /* JADX INFO: renamed from: c */
        public final List<User> f12084c;

        public C0862a(List<User> list) {
            ArrayList arrayList = new ArrayList();
            this.f12084c = arrayList;
            arrayList.addAll(list);
        }

        /* JADX INFO: renamed from: C */
        public int m13541C() {
            return this.f12084c.size();
        }

        /* JADX INFO: renamed from: D */
        public View m13542D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(e05.this.m13533C0()).inflate(f6c0.h1, viewGroup, false);
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void m13540A(View view, final User user, int i, int i2) {
            int iD = (t100.d(30.0f) * xdl0.y0()) / t100.d(375.0f);
            xdl0.D0(iD, new View[]{view});
            xdl0.C0(view, iD);
            qib0.G.L0((VDraweeView) view, user.fp().profileSmall().formatted());
            xdl0.E0(view, new View.OnClickListener() { // from class: l.d05
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f10832a.m13545H(user, view2);
                }
            });
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public User getItem(int i) {
            return this.f12084c.get(i);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m13545H(User user, View view) {
            zvf0.r("e_chat_avatar", e05.this.act().pageId());
            lva.D(e05.this.act(), Uri.parse(String.format("tantanapp://jumpChat?uid=%s", ((DbObject) user).id)));
        }
    }

    /* JADX INFO: renamed from: l.e05$b */
    public class C0863b extends dac0<ChatPartnersHistoryItem> {

        /* JADX INFO: renamed from: c */
        public List<ChatPartnersHistoryItem> f12086c;

        public C0863b() {
            this.f12086c = new ArrayList();
        }

        /* JADX INFO: renamed from: C */
        public int m13547C() {
            return this.f12086c.size();
        }

        /* JADX INFO: renamed from: D */
        public View m13548D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(e05.this.m13533C0()).inflate(f6c0.i1, viewGroup, false);
        }

        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public void m13546A(View view, ChatPartnersHistoryItem chatPartnersHistoryItem, int i, int i2) {
            VText vTextFindViewById = view.findViewById(u4c0.ge);
            VText vTextFindViewById2 = view.findViewById(u4c0.Yd);
            VRecyclerView vRecyclerViewFindViewById = view.findViewById(u4c0.b7);
            VText vTextFindViewById3 = view.findViewById(u4c0.n2);
            vTextFindViewById.setText(chatPartnersHistoryItem.messageValue);
            vTextFindViewById2.setText(new g7c("yyyy.MM.dd HH.mm", Locale.getDefault()).m14796a().format(Double.valueOf(chatPartnersHistoryItem.createdTime)));
            vTextFindViewById3.setText(String.format(Locale.CHINA, "找到%d个好友", Integer.valueOf(chatPartnersHistoryItem.userIds.size())));
            ArrayList arrayList = new ArrayList();
            Iterator it = chatPartnersHistoryItem.userIds.iterator();
            while (it.hasNext()) {
                User userM11803l0 = e05.this.f12082f.m11803l0((String) it.next());
                if (NullChecker.a(userM11803l0)) {
                    arrayList.add(userM11803l0);
                }
            }
            vRecyclerViewFindViewById.setAdapter(e05.this.new C0862a(arrayList));
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public ChatPartnersHistoryItem getItem(int i) {
            return this.f12086c.get(i);
        }

        /* JADX INFO: renamed from: G */
        public void m13551G(List<ChatPartnersHistoryItem> list) {
            this.f12086c = list;
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: e */
        public void m13552e(int i) {
            if (this.f12086c.size() <= 0 || this.f12086c.size() - i >= 3) {
                return;
            }
            e05.this.f12082f.m11801b();
        }
    }

    public e05(ChatPartnerHistoryAct chatPartnerHistoryAct) {
        this.f12081e = chatPartnerHistoryAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m13532e(View view) {
        act().finish();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m13533C0() {
        return this.f12081e;
    }

    @Nullable
    public Act act() {
        return this.f12081e;
    }

    /* JADX INFO: renamed from: c */
    public View m13534c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g05.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m13537i1(b05 b05Var) {
        this.f12082f = b05Var;
    }

    /* JADX INFO: renamed from: f */
    public void m13536f(List<ChatPartnersHistoryItem> list) {
        xdl0.M(this.f12080d, vwb.J(list));
        this.f12083g.m13551G(list);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m13534c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m13538r() {
        xdl0.E0(this.f12078b, new View.OnClickListener() { // from class: l.c05
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10369a.m13532e(view);
            }
        });
        C0863b c0863b = new C0863b();
        this.f12083g = c0863b;
        this.f12079c.setAdapter(c0863b);
    }

    public void destroy() {
    }
}
