package p002l;

import com.p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class l1c implements Comparator<LongLinkLiveDanmakuMessage.BulletCommentInfo> {

    /* JADX INFO: renamed from: a */
    public final List<LongLinkLiveDanmakuMessage.BulletCommentInfo> f14646a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ReentrantLock f14647b = new ReentrantLock();

    /* JADX INFO: renamed from: c */
    public volatile LongLinkLiveDanmakuMessage.BulletCommentInfo f14648c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f14649d;

    /* JADX INFO: renamed from: a */
    public void m16929a(LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo) {
        this.f14647b.lock();
        if (this.f14649d) {
            m16932d();
        }
        bulletCommentInfo.getMasks(0).getOriginUserId();
        bulletCommentInfo.getVideoLiveBulletComment().getContent();
        Thread.currentThread().getName();
        if (this.f14648c != null && bulletCommentInfo.getVideoLiveBulletComment().getPriority() < this.f14648c.getVideoLiveBulletComment().getPriority()) {
            LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo2 = this.f14648c;
            this.f14648c = bulletCommentInfo;
            this.f14646a.add(0, bulletCommentInfo2);
            bulletCommentInfo.getMasks(0).getOriginUserId();
            bulletCommentInfo.getVideoLiveBulletComment().getContent();
            Thread.currentThread().getName();
            this.f14647b.unlock();
            return;
        }
        this.f14646a.add(bulletCommentInfo);
        Collections.sort(this.f14646a, this);
        if (this.f14646a.size() > 1000) {
            List<LongLinkLiveDanmakuMessage.BulletCommentInfo> list = this.f14646a;
            list.remove(list.size() - 1);
        }
        if (this.f14648c == null) {
            this.f14648c = this.f14646a.remove(0);
        }
        bulletCommentInfo.getMasks(0).getOriginUserId();
        bulletCommentInfo.getVideoLiveBulletComment().getContent();
        Thread.currentThread().getName();
        this.f14647b.unlock();
    }

    /* JADX INFO: renamed from: b */
    public void m16930b() {
        if (!this.f14647b.tryLock()) {
            this.f14649d = true;
        } else {
            m16932d();
            this.f14647b.unlock();
        }
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compare(LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo, LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo2) {
        return (int) (bulletCommentInfo.getVideoLiveBulletComment().getPriority() - bulletCommentInfo2.getVideoLiveBulletComment().getPriority());
    }

    /* JADX INFO: renamed from: d */
    public final void m16932d() {
        this.f14646a.clear();
        this.f14648c = null;
        this.f14649d = false;
        hashCode();
    }

    /* JADX INFO: renamed from: e */
    public LongLinkLiveDanmakuMessage.BulletCommentInfo m16933e() {
        if (!this.f14647b.tryLock()) {
            Thread.currentThread().getName();
            return null;
        }
        if (this.f14649d) {
            m16932d();
            this.f14647b.unlock();
            Thread.currentThread().getName();
            return null;
        }
        if (this.f14648c == null) {
            Thread.currentThread().getName();
            this.f14647b.unlock();
            return null;
        }
        LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo = this.f14648c;
        if (this.f14646a.size() > 0) {
            this.f14648c = this.f14646a.remove(0);
        } else {
            this.f14648c = null;
        }
        bulletCommentInfo.getMasks(0).getOriginUserId();
        bulletCommentInfo.getVideoLiveBulletComment().getContent();
        Thread.currentThread().getName();
        this.f14647b.unlock();
        return bulletCommentInfo;
    }
}
