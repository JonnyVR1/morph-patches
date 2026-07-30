package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLivePkPunishMotion;
import com.p051p1.mobile.putong.live.base.data.BLivePkSetting;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class o8b0 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public View f145369i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f145370j;

    /* JADX INFO: renamed from: k */
    public TextView f145371k;

    /* JADX INFO: renamed from: l */
    public TextView f145372l;

    /* JADX INFO: renamed from: m */
    public RecyclerView f145373m;

    /* JADX INFO: renamed from: n */
    public TextView f145374n;

    /* JADX INFO: renamed from: o */
    public DialogC12774a f145375o;

    /* JADX INFO: renamed from: p */
    public kcg0 f145376p;

    /* JADX INFO: renamed from: q */
    public s680 f145377q;

    /* JADX INFO: renamed from: r */
    public b8b0 f145378r;

    public o8b0(dum dumVar, s680 s680Var) {
        super(dumVar);
        this.f145377q = s680Var;
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m166458J3(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m166462N3(BLivePkSetting bLivePkSetting, ArrayList arrayList, final String str) {
        BLivePkPunishMotion bLivePkPunishMotion = (BLivePkPunishMotion) jyb.m147529r(bLivePkSetting.pkMotions, new qcj() { // from class: l.n8b0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((BLivePkPunishMotion) obj).f45275id));
            }
        });
        if (bLivePkPunishMotion != null) {
            arrayList.add(bLivePkPunishMotion);
        }
    }

    /* JADX INFO: renamed from: S3 */
    private List<BLivePkPunishMotion> m166463S3() {
        final ArrayList arrayList = new ArrayList();
        BLiveSettings bLiveSettingsM203370A3 = zrv.m221193k().m203370A3();
        if (bLiveSettingsM203370A3 == null) {
            return arrayList;
        }
        final BLivePkSetting bLivePkSetting = bLiveSettingsM203370A3.liveConfig.f45200pk;
        jyb.m147537z(bLivePkSetting.punishMotionSelectIds, new y20() { // from class: l.m8b0
            @Override // p153l.y20
            public final void call(Object obj) {
                o8b0.m166462N3(bLivePkSetting, arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: T3 */
    private String m166464T3(long j) {
        return String.format(zrv.f205803e.getString(R$string.f47570Hb), String.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m166465U3(String str) {
        m166469P3(str, false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: W3 */
    private void m166466W3() {
        psd0.m173633z(this.f145376p);
        this.f145376p = m138858H3(m213810E2().m168525i2(TimeUnit.SECONDS)).subscribe(dhw.m115825d(new y20() { // from class: l.k8b0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124370a.m166467X3((Long) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public void m166467X3(Long l2) {
        if (10 - l2.longValue() <= 0) {
            psd0.m173633z(this.f145376p);
            b8b0 b8b0Var = this.f145378r;
            m166469P3(b8b0Var.getItem(gkc0.f104723a.nextInt(b8b0Var.getPageCount())).f45275id, true);
        }
        this.f145374n.setText(m166464T3((int) (10 - l2.longValue())));
    }

    /* JADX INFO: renamed from: O3 */
    public View m166468O3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return p8b0.m171229b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: P3 */
    public void m166469P3(String str, boolean z) {
        n180.m161093j("choosePunish punishId:" + str + ",isAuto:" + z);
        m166470R3();
        duringCreated(LivingNormalApiProvider.m72820z7(this.f145377q.m184859T3(), str, z)).subscribe(dhw.m115826e(new y20() { // from class: l.l8b0
            @Override // p153l.y20
            public final void call(Object obj) {
                o8b0.m166458J3((uxj0) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: R3 */
    public void m166470R3() {
        DialogC12774a dialogC12774a = this.f145375o;
        if (dialogC12774a != null) {
            dialogC12774a.dismiss();
        }
        psd0.m173633z(this.f145376p);
    }

    /* JADX INFO: renamed from: V3 */
    public void m166471V3(Act act) {
        if (this.f145375o == null) {
            this.f145375o = new c0s(this, m166468O3(act.inflater(), null));
            this.f145373m.setLayoutManager(new LinearLayoutManager(act, 0, false));
            b8b0 b8b0Var = new b8b0();
            this.f145378r = b8b0Var;
            this.f145373m.setAdapter(b8b0Var);
            this.f145378r.m102960I(new y20() { // from class: l.j8b0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f118767a.m166465U3((String) obj);
                }
            });
        }
        BLiveUserMask bLiveUserMask = (BLiveUserMask) m138856F3(new db20(600));
        this.f145370j.setImageResource(obc0.f146082J8);
        if (!eb20.m120149b() || bLiveUserMask == null) {
            izs.m142869t("context_single_room", this.f145370j, zrv.f205799a.m207651V().picture(0).url, qa00.f156337x);
            this.f145371k.setText(zrv.f205799a.m207651V().name);
        } else {
            izs.m142869t("context_single_room", this.f145370j, bLiveUserMask.avatar, qa00.f156337x);
            this.f145371k.setText(bLiveUserMask.name);
        }
        this.f145374n.setText(m166464T3(10L));
        if (((jfv) zrv.m221194l(htd0.f111520b)).m144722i(zrv.f205799a.m207631D0()).hierarchy.grade < 38 || eb20.m120149b()) {
            this.f145372l.setText(act.getString(R$string.f47783Ra));
        } else {
            this.f145372l.setText(act.getString(R$string.f47888Wa));
        }
        m166466W3();
        this.f145378r.m102961J(m166463S3());
        this.f145375o.show();
    }
}
