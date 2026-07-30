package p153l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.Contact;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VLinear;
import p151v.VText;
import p151v.VText_Tags;

/* JADX INFO: loaded from: classes4.dex */
public class fwa0 extends ep90 {

    /* JADX INFO: renamed from: u */
    public VLinear f101142u;

    /* JADX INFO: renamed from: v */
    public VText f101143v;

    /* JADX INFO: renamed from: w */
    public VText_Tags f101144w;

    public fwa0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m127752R() {
        User userMo53478me = mo53983O().mo53478me();
        User userMo52252K2 = mo53983O().mo52252K2();
        if ((NullChecker.m82486a(userMo52252K2.localRelationship) && TEnum.equals(userMo52252K2.localRelationship.state, "matched")) || (NullChecker.m82486a(userMo52252K2.localFollowship) && TEnum.equals(userMo52252K2.localFollowship.state, "matched"))) {
            return false;
        }
        return (userMo53478me == null || !(TEnum.equals(userMo53478me.source, "facebook") || userMo53478me.settings.hideMutualContacts().booleanValue())) && !userMo52252K2.profile.contactLookups.lookups.isEmpty();
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f101142u = (VLinear) view.findViewById(adc0.f69942I1);
        this.f101143v = (VText) view.findViewById(adc0.f69932H8);
        this.f101144w = (VText_Tags) view.findViewById(adc0.f69915G8);
        this.f101142u.setVisibility(0);
        this.f101143v.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return m127752R();
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return mo53983O().mo146493H2().inflate(kec0.f125343Ba, viewGroup, false);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        List<Contact> list = mo53983O().mo52252K2().profile.contactLookups.lookups;
        StringBuffer stringBuffer = new StringBuffer();
        if (list.size() <= 3) {
            for (int i = 0; i < list.size(); i++) {
                stringBuffer.append(list.get(i).name);
                if (i < list.size() - 1) {
                    stringBuffer.append("、");
                }
            }
        } else if (list.size() <= 20) {
            stringBuffer.append(CoreModule.f18263b.getString(R$string.f19715ul, Integer.valueOf(list.size())));
        } else {
            stringBuffer.append(CoreModule.f18263b.getString(R$string.f19746vl, Integer.valueOf(list.size())));
        }
        this.f101144w.setText(stringBuffer.toString());
    }
}
