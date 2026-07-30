package p149l;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import com.p046p1.mobile.putong.live.base.data.BLivePKCardItem;
import com.p046p1.mobile.putong.live.base.data.BLivePKCardShowList;
import com.p046p1.mobile.putong.live.base.data.BLivePKCardShowListWithBoth;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.bean.PkData;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.internal.PkViewInternal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p147v.VImage;

/* JADX INFO: loaded from: classes5.dex */
public class xl70 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public View f193387i;

    /* JADX INFO: renamed from: j */
    public VImage f193388j;

    /* JADX INFO: renamed from: k */
    public VImage f193389k;

    /* JADX INFO: renamed from: l */
    public TextView f193390l;

    /* JADX INFO: renamed from: m */
    public RecyclerView f193391m;

    /* JADX INFO: renamed from: n */
    public DialogC12611a f193392n;

    /* JADX INFO: renamed from: o */
    public LiveBaseAdapter f193393o;

    /* JADX INFO: renamed from: p */
    public PkData f193394p;

    /* JADX INFO: renamed from: q */
    public c4g0 f193395q;

    /* JADX INFO: renamed from: r */
    public List<BLivePKCardItem> f193396r;

    /* JADX INFO: renamed from: s */
    public int f193397s;

    public xl70(bsm bsmVar) {
        super(bsmVar);
        this.f193397s = 5;
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ Boolean m209849P3(gat gatVar) {
        int i = gatVar.f101703a;
        return Boolean.valueOf(i == 5 || i == 6);
    }

    /* JADX INFO: renamed from: W3 */
    private void m209853W3() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(act());
        linearLayoutManager.setOrientation(0);
        this.f193391m.setLayoutManager(linearLayoutManager);
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f193393o = liveBaseAdapter;
        this.f193391m.setAdapter(liveBaseAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public /* synthetic */ void m209854Y3(View view) {
        m209859V3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z3 */
    public /* synthetic */ void m209855Z3(View view) {
        m209859V3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m209856a4(View view) {
        m129317w3(ddv.f85643O, t100.m186890d(310.0f), 600, 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m209857d4(gat gatVar) {
        this.f193397s = gatVar.f101703a;
        if (!gatVar.f101704b) {
            m209859V3();
        } else {
            if (isShowing()) {
                return;
            }
            m209865g4();
        }
    }

    private boolean isShowing() {
        DialogC12611a dialogC12611a = this.f193392n;
        return dialogC12611a != null && dialogC12611a.isShowing();
    }

    /* JADX INFO: renamed from: U3 */
    public View m209858U3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yl70.m215258b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V3 */
    public void m209859V3() {
        DialogC12611a dialogC12611a = this.f193392n;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f193392n.dismiss();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m209860X3(BLivePKCardShowList bLivePKCardShowList) {
        this.f193396r = bLivePKCardShowList.itemCardList;
        m209866h4();
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m209861b4(DialogInterface dialogInterface) {
        mkd0.m154992z(this.f193395q);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m209862c4(Long l2) {
        m209866h4();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m209863e4(BLivePKCardShowListWithBoth bLivePKCardShowListWithBoth) {
        this.f193396r = this.f193397s == 5 ? bLivePKCardShowListWithBoth.BLiveUserItemCards : bLivePKCardShowListWithBoth.BLiveOtherUserItemCardsList;
        if (isShowing()) {
            m209866h4();
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final void m209864f4(int i) {
        PkData pkData = this.f193394p;
        duringCreated(LivingNormalApiProvider.m71230G5(this.f193394p.f51567pk.f44421id, i == 5 ? pkData.getAnchorId() : pkData.otherUserId())).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.wl70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186879a.m209860X3((BLivePKCardShowList) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [l.ho2] */
    /* JADX INFO: renamed from: g4 */
    public void m209865g4() {
        String str;
        if (this.f193392n == null) {
            this.f193392n = new byr(this, m209858U3(act().inflater(), null));
            this.f193388j.setOnClickListener(new View.OnClickListener() { // from class: l.rl70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f159933a.m209854Y3(view);
                }
            });
            this.f193387i.setOnClickListener(new View.OnClickListener() { // from class: l.sl70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f165143a.m209855Z3(view);
                }
            });
            xdl0.m208329E0(this.f193389k, new View.OnClickListener() { // from class: l.tl70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f171004a.m209856a4(view);
                }
            });
            this.f193392n.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ul70
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f177018a.m209861b4(dialogInterface);
                }
            });
            m209853W3();
        }
        this.f193391m.scrollToPosition(0);
        this.f193394p = (PkData) m129297F3(new lm70(600));
        TextView textView = this.f193390l;
        if (this.f193397s == 5) {
            str = "PK道具卡";
        } else {
            str = w8u.m202213p(this.f193394p.otherUser().name, 3) + "的PK道具卡";
        }
        textView.setText(str);
        m209864f4(this.f193397s);
        this.f193392n.show();
        mkd0.m154992z(this.f193395q);
        this.f193395q = m129299H3(m206027E2().m132139i2(TimeUnit.SECONDS)).subscribe(ffw.m121193d(new e30() { // from class: l.vl70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181921a.m209862c4((Long) obj);
            }
        }));
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: h4 */
    public final void m209866h4() {
        this.f193396r = vwb.m200339n(this.f193396r, new w9j() { // from class: l.ql70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLivePKCardItem bLivePKCardItem = (BLivePKCardItem) obj;
                return Boolean.valueOf((PkViewInternal.m76058E(bLivePKCardItem.startTs, bLivePKCardItem.duration) < 0 || TextUtils.equals(bLivePKCardItem.type, "magnetCardResult") || TextUtils.equals(bLivePKCardItem.type, "critCardResult")) ? false : true);
            }
        });
        if (!isShowing() || this.f193396r == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f193396r.size(); i++) {
            arrayList.add(new cl4(this.f193396r.get(i)));
        }
        this.f193393o.m67371Z(arrayList);
        this.f193393o.notifyDataSetChanged();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().LivePkEvent.showPkDialog().m172460g()).filter(new w9j() { // from class: l.nl70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xl70.m209849P3((gat) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.ol70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144481a.m209857d4((gat) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().f170444e2).subscribe(ffw.m121197h(new e30() { // from class: l.pl70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150080a.m209863e4((BLivePKCardShowListWithBoth) obj);
            }
        }));
    }
}
