package p002l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Contact;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.f6c0;
import l.mcr;
import l.u4c0;
import v.VLinear;
import v.VText;
import v.VText_Tags;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class boa0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear f8291u;

    /* JADX INFO: renamed from: v */
    public VText f8292v;

    /* JADX INFO: renamed from: w */
    public VText_Tags f8293w;

    public boa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m10536R() {
        User userMo2827me = mo3351O().mo2827me();
        User userMo1517K2 = mo3351O().mo1517K2();
        if ((NullChecker.a(userMo1517K2.localRelationship) && TEnum.equals(userMo1517K2.localRelationship.state, "matched")) || (NullChecker.a(userMo1517K2.localFollowship) && TEnum.equals(userMo1517K2.localFollowship.state, "matched"))) {
            return false;
        }
        return (userMo2827me == null || !(TEnum.equals(userMo2827me.source, "facebook") || userMo2827me.settings.hideMutualContacts().booleanValue())) && !userMo1517K2.profile.contactLookups.lookups.isEmpty();
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f8291u = view.findViewById(u4c0.I1);
        this.f8292v = view.findViewById(u4c0.F8);
        this.f8293w = view.findViewById(u4c0.E8);
        this.f8291u.setVisibility(0);
        this.f8292v.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return m10536R();
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return mo3351O().mo9267H2().inflate(f6c0.ua, viewGroup, false);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        List list = mo3351O().mo1517K2().profile.contactLookups.lookups;
        StringBuffer stringBuffer = new StringBuffer();
        if (list.size() <= 3) {
            for (int i = 0; i < list.size(); i++) {
                stringBuffer.append(((Contact) list.get(i)).name);
                if (i < list.size() - 1) {
                    stringBuffer.append("、");
                }
            }
        } else if (list.size() <= 20) {
            stringBuffer.append(CoreModule.b.getString(R.string.Yk, Integer.valueOf(list.size())));
        } else {
            stringBuffer.append(CoreModule.b.getString(R.string.Zk, Integer.valueOf(list.size())));
        }
        this.f8293w.setText(stringBuffer.toString());
    }
}
