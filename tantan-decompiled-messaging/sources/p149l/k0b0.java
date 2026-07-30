package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLivePkPunishMotion;
import com.p046p1.mobile.putong.live.base.data.BLivePkSetting;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class k0b0 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public View f120467i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f120468j;

    /* JADX INFO: renamed from: k */
    public TextView f120469k;

    /* JADX INFO: renamed from: l */
    public TextView f120470l;

    /* JADX INFO: renamed from: m */
    public RecyclerView f120471m;

    /* JADX INFO: renamed from: n */
    public TextView f120472n;

    /* JADX INFO: renamed from: o */
    public DialogC12611a f120473o;

    /* JADX INFO: renamed from: p */
    public c4g0 f120474p;

    /* JADX INFO: renamed from: q */
    public my70 f120475q;

    /* JADX INFO: renamed from: r */
    public xza0 f120476r;

    public k0b0(bsm bsmVar, my70 my70Var) {
        super(bsmVar);
        this.f120475q = my70Var;
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m144014J3(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m144018N3(BLivePkSetting bLivePkSetting, ArrayList arrayList, final String str) {
        BLivePkPunishMotion bLivePkPunishMotion = (BLivePkPunishMotion) vwb.m200346r(bLivePkSetting.pkMotions, new w9j() { // from class: l.j0b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((BLivePkPunishMotion) obj).f44427id));
            }
        });
        if (bLivePkPunishMotion != null) {
            arrayList.add(bLivePkPunishMotion);
        }
    }

    /* JADX INFO: renamed from: S3 */
    private List<BLivePkPunishMotion> m144019S3() {
        final ArrayList arrayList = new ArrayList();
        BLiveSettings bLiveSettingsM195583A3 = ypv.m215672k().m195583A3();
        if (bLiveSettingsM195583A3 == null) {
            return arrayList;
        }
        final BLivePkSetting bLivePkSetting = bLiveSettingsM195583A3.liveConfig.f44352pk;
        vwb.m200354z(bLivePkSetting.punishMotionSelectIds, new e30() { // from class: l.i0b0
            @Override // p149l.e30
            public final void call(Object obj) {
                k0b0.m144018N3(bLivePkSetting, arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: T3 */
    private String m144020T3(long j) {
        return String.format(ypv.f199497e.getString(R$string.f46722Hb), String.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m144021U3(String str) {
        m144025P3(str, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: W3 */
    private void m144022W3() {
        mkd0.m154992z(this.f120474p);
        this.f120474p = m129299H3(m206027E2().m132139i2(TimeUnit.SECONDS)).subscribe(ffw.m121193d(new e30() { // from class: l.g0b0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100033a.m144023X3((Long) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public void m144023X3(Long l2) {
        if (10 - l2.longValue() <= 0) {
            mkd0.m154992z(this.f120474p);
            xza0 xza0Var = this.f120476r;
            m144025P3(xza0Var.getItem(zbc0.f202434a.nextInt(xza0Var.getPageCount())).f44427id, true);
        }
        this.f120472n.setText(m144020T3((int) (10 - l2.longValue())));
    }

    /* JADX INFO: renamed from: O3 */
    public View m144024O3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l0b0.m148037b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: P3 */
    public void m144025P3(String str, boolean z) {
        ht70.m132853j("choosePunish punishId:" + str + ",isAuto:" + z);
        m144026R3();
        duringCreated(LivingNormalApiProvider.m71637z7(this.f120475q.m156975T3(), str, z)).subscribe(ffw.m121194e(new e30() { // from class: l.h0b0
            @Override // p149l.e30
            public final void call(Object obj) {
                k0b0.m144014J3((roj0) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: R3 */
    public void m144026R3() {
        DialogC12611a dialogC12611a = this.f120473o;
        if (dialogC12611a != null) {
            dialogC12611a.dismiss();
        }
        mkd0.m154992z(this.f120474p);
    }

    /* JADX INFO: renamed from: V3 */
    public void m144027V3(Act act) {
        if (this.f120473o == null) {
            this.f120473o = new byr(this, m144024O3(act.inflater(), null));
            this.f120471m.setLayoutManager(new LinearLayoutManager(act, 0, false));
            xza0 xza0Var = new xza0();
            this.f120476r = xza0Var;
            this.f120471m.setAdapter(xza0Var);
            this.f120476r.m211948I(new e30() { // from class: l.f0b0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f93969a.m144021U3((String) obj);
                }
            });
        }
        BLiveUserMask bLiveUserMask = (BLiveUserMask) m129297F3(new v220(600));
        this.f120468j.setImageResource(i3c0.f110754J8);
        if (!w220.m201015b() || bLiveUserMask == null) {
            hxs.m133407t("context_single_room", this.f120468j, ypv.f199493a.m199329V().picture(0).url, t100.f167275x);
            this.f120469k.setText(ypv.f199493a.m199329V().name);
        } else {
            hxs.m133407t("context_single_room", this.f120468j, bLiveUserMask.avatar, t100.f167275x);
            this.f120469k.setText(bLiveUserMask.name);
        }
        this.f120472n.setText(m144020T3(10L));
        if (((idv) ypv.m215673l(fld0.f98147b)).m135637i(ypv.f199493a.m199309D0()).hierarchy.grade < 38 || w220.m201015b()) {
            this.f120470l.setText(act.getString(R$string.f46935Ra));
        } else {
            this.f120470l.setText(act.getString(R$string.f47040Wa));
        }
        m144022W3();
        this.f120476r.m211949J(m144019S3());
        this.f120473o.show();
    }
}
