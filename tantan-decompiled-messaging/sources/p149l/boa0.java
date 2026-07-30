package p149l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.Contact;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VLinear;
import p147v.VText;
import p147v.VText_Tags;

/* JADX INFO: loaded from: classes4.dex */
public class boa0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear f76490u;

    /* JADX INFO: renamed from: v */
    public VText f76491v;

    /* JADX INFO: renamed from: w */
    public VText_Tags f76492w;

    public boa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m102910R() {
        User userMo52295me = mo52800O().mo52295me();
        User userMo51069K2 = mo52800O().mo51069K2();
        if ((NullChecker.m81303a(userMo51069K2.localRelationship) && TEnum.equals(userMo51069K2.localRelationship.state, "matched")) || (NullChecker.m81303a(userMo51069K2.localFollowship) && TEnum.equals(userMo51069K2.localFollowship.state, "matched"))) {
            return false;
        }
        return (userMo52295me == null || !(TEnum.equals(userMo52295me.source, "facebook") || userMo52295me.settings.hideMutualContacts().booleanValue())) && !userMo51069K2.profile.contactLookups.lookups.isEmpty();
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f76490u = (VLinear) view.findViewById(u4c0.f173854I1);
        this.f76491v = (VText) view.findViewById(u4c0.f173810F8);
        this.f76492w = (VText_Tags) view.findViewById(u4c0.f173793E8);
        this.f76490u.setVisibility(0);
        this.f76491v.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return m102910R();
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return mo52800O().mo94568H2().inflate(f6c0.f96032ua, viewGroup, false);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        List<Contact> list = mo52800O().mo51069K2().profile.contactLookups.lookups;
        StringBuffer stringBuffer = new StringBuffer();
        if (list.size() <= 3) {
            for (int i = 0; i < list.size(); i++) {
                stringBuffer.append(list.get(i).name);
                if (i < list.size() - 1) {
                    stringBuffer.append("、");
                }
            }
        } else if (list.size() <= 20) {
            stringBuffer.append(CoreModule.f17544b.getString(R$string.f18307Yk, Integer.valueOf(list.size())));
        } else {
            stringBuffer.append(CoreModule.f17544b.getString(R$string.f18337Zk, Integer.valueOf(list.size())));
        }
        this.f76492w.setText(stringBuffer.toString());
    }
}
