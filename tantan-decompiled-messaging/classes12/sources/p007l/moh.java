package p007l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.MessageLocation;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.NewPostLocationAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiDialogLocationItem;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class moh extends dac0<noh> {

    /* JADX INFO: renamed from: c */
    public MessageLocation f10530c;

    /* JADX INFO: renamed from: d */
    public Act f10531d;

    /* JADX INFO: renamed from: e */
    public String f10532e;

    /* JADX INFO: renamed from: f */
    public String f10533f;

    /* JADX INFO: renamed from: g */
    public List<noh> f10534g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public InterfaceC2431a f10535h;

    /* JADX INFO: renamed from: l.moh$a */
    public interface InterfaceC2431a {
        /* JADX INFO: renamed from: l */
        void mo10308l(MessageLocation messageLocation);
    }

    public moh(Act act, String str, String str2) {
        this.f10531d = act;
        this.f10532e = str;
        this.f10533f = str2;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ Boolean m11993E(k90 k90Var, noh nohVar) {
        MessageLocation messageLocation = nohVar.f10844a;
        return messageLocation == null ? Boolean.FALSE : Boolean.valueOf(TextUtils.equals(messageLocation.name, k90Var.m11398c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m11996L(View view) {
        m11997P();
    }

    /* JADX INFO: renamed from: P */
    private void m11997P() {
        Act act = this.f10531d;
        act.startActivity(NewPostLocationAct.m3708V1(act, qnh.f12295K));
        this.f10531d.overridePendingTransition(uzb0.f13995i, 0);
    }

    /* JADX INFO: renamed from: C */
    public int m11999C() {
        List<noh> list = this.f10534g;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* JADX INFO: renamed from: D */
    public View m12000D(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return this.f10531d.inflater().inflate(o6c0.f11244k2, viewGroup, false);
        }
        View view = new View(this.f10531d);
        view.setLayoutParams(new RecyclerView.p(t100.y, t100.a));
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiDialogLocationItem] */
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m11998A(View view, final noh nohVar, int i, int i2) {
        if (i == 2) {
            ?? r1 = (FeedPoiDialogLocationItem) view;
            if (nohVar.f10845b == 5) {
                r1.m6113Q();
                xdl0.E0((View) r1, new View.OnClickListener() { // from class: l.koh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f9759a.m11996L(view2);
                    }
                });
            } else {
                MessageLocation messageLocation = nohVar.f10844a;
                r1.m6114R(messageLocation.name, m12004K(messageLocation));
                xdl0.E0((View) r1, new View.OnClickListener() { // from class: l.loh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f10086a.m12005M(nohVar, view2);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public noh getItem(int i) {
        return this.f10534g.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m12003J(final k90 k90Var) {
        List<noh> list;
        if (k90Var == null || (list = this.f10534g) == null || list.size() <= 1) {
            return;
        }
        noh nohVar = (noh) vwb.r(this.f10534g, new w9j() { // from class: l.joh
            public final Object call(Object obj) {
                return moh.m11993E(k90Var, (noh) obj);
            }
        });
        if (NullChecker.a(nohVar)) {
            m12008Q(nohVar.f10844a);
            return;
        }
        MessageLocation messageLocationM12947d = p980.m12947d(k90Var);
        noh nohVar2 = new noh(messageLocationM12947d, 4);
        int i = this.f10534g.get(1).f10845b;
        List<noh> list2 = this.f10534g;
        if (i == 4) {
            list2.set(1, nohVar2);
        } else {
            list2.add(1, nohVar2);
        }
        m12008Q(messageLocationM12947d);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m12004K(MessageLocation messageLocation) {
        MessageLocation messageLocation2 = this.f10530c;
        if (messageLocation2 == null || messageLocation == null) {
            return false;
        }
        return TextUtils.equals(messageLocation2.name, messageLocation.name);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m12005M(noh nohVar, View view) {
        m12009R(nohVar.f10844a, true);
    }

    /* JADX INFO: renamed from: N */
    public void m12006N(List<noh> list, MessageLocation messageLocation) {
        this.f10534g = list;
        this.f10530c = messageLocation;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: O */
    public void m12007O(InterfaceC2431a interfaceC2431a) {
        this.f10535h = interfaceC2431a;
    }

    /* JADX INFO: renamed from: Q */
    public void m12008Q(MessageLocation messageLocation) {
        m12009R(messageLocation, false);
    }

    /* JADX INFO: renamed from: R */
    public void m12009R(MessageLocation messageLocation, boolean z) {
        if (messageLocation == null) {
            return;
        }
        MessageLocation messageLocation2 = this.f10530c;
        if (messageLocation2 == null || !TextUtils.equals(messageLocation.name, messageLocation2.name)) {
            this.f10530c = messageLocation;
            notifyDataSetChanged();
            if (NullChecker.a(this.f10535h)) {
                this.f10535h.mo10308l(this.f10530c);
            }
            if (z) {
                zvf0.r("e_poi_tag", this.f10532e);
            }
        }
    }

    public int getItemViewType(int i) {
        return getItem(i).f10845b == 1 ? 1 : 2;
    }
}
