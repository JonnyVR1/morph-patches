package p153l;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.p051p1.mobile.putong.core.data.GPTopicCard;
import com.p051p1.mobile.putong.core.newui.discovery.TopicUsersListFrag;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class zti0 extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: a */
    public List<GPTopicCard> f206010a;

    public zti0(FragmentManager fragmentManager, List<GPTopicCard> list) {
        super(fragmentManager);
        this.f206010a = list;
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f206010a.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    @NonNull
    public Fragment getItem(int i) {
        TopicUsersListFrag topicUsersListFrag = new TopicUsersListFrag();
        Bundle bundle = new Bundle();
        bundle.putSerializable("type_topic_name", this.f206010a.get(i));
        topicUsersListFrag.setArguments(bundle);
        return topicUsersListFrag;
    }

    /* JADX INFO: renamed from: j */
    public void m221540j(List<GPTopicCard> list) {
        this.f206010a.clear();
        this.f206010a.addAll(list);
        notifyDataSetChanged();
    }
}
