package p149l;

import com.p046p1.mobile.longlink.msg.livegift.LongLinkLiveDanmakuMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes4.dex */
public class l1c implements Comparator<LongLinkLiveDanmakuMessage.BulletCommentInfo> {

    /* JADX INFO: renamed from: a */
    public final List<LongLinkLiveDanmakuMessage.BulletCommentInfo> f125630a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ReentrantLock f125631b = new ReentrantLock();

    /* JADX INFO: renamed from: c */
    public volatile LongLinkLiveDanmakuMessage.BulletCommentInfo f125632c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f125633d;

    /* JADX INFO: renamed from: a */
    public void m148152a(LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo) {
        this.f125631b.lock();
        if (this.f125633d) {
            m148155d();
        }
        bulletCommentInfo.getMasks(0).getOriginUserId();
        bulletCommentInfo.getVideoLiveBulletComment().getContent();
        Thread.currentThread().getName();
        if (this.f125632c != null && bulletCommentInfo.getVideoLiveBulletComment().getPriority() < this.f125632c.getVideoLiveBulletComment().getPriority()) {
            LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo2 = this.f125632c;
            this.f125632c = bulletCommentInfo;
            this.f125630a.add(0, bulletCommentInfo2);
            bulletCommentInfo.getMasks(0).getOriginUserId();
            bulletCommentInfo.getVideoLiveBulletComment().getContent();
            Thread.currentThread().getName();
            this.f125631b.unlock();
            return;
        }
        this.f125630a.add(bulletCommentInfo);
        Collections.sort(this.f125630a, this);
        if (this.f125630a.size() > 1000) {
            List<LongLinkLiveDanmakuMessage.BulletCommentInfo> list = this.f125630a;
            list.remove(list.size() - 1);
        }
        if (this.f125632c == null) {
            this.f125632c = this.f125630a.remove(0);
        }
        bulletCommentInfo.getMasks(0).getOriginUserId();
        bulletCommentInfo.getVideoLiveBulletComment().getContent();
        Thread.currentThread().getName();
        this.f125631b.unlock();
    }

    /* JADX INFO: renamed from: b */
    public void m148153b() {
        if (!this.f125631b.tryLock()) {
            this.f125633d = true;
        } else {
            m148155d();
            this.f125631b.unlock();
        }
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compare(LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo, LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo2) {
        return (int) (bulletCommentInfo.getVideoLiveBulletComment().getPriority() - bulletCommentInfo2.getVideoLiveBulletComment().getPriority());
    }

    /* JADX INFO: renamed from: d */
    public final void m148155d() {
        this.f125630a.clear();
        this.f125632c = null;
        this.f125633d = false;
        hashCode();
    }

    /* JADX INFO: renamed from: e */
    public LongLinkLiveDanmakuMessage.BulletCommentInfo m148156e() {
        if (!this.f125631b.tryLock()) {
            Thread.currentThread().getName();
            return null;
        }
        if (this.f125633d) {
            m148155d();
            this.f125631b.unlock();
            Thread.currentThread().getName();
            return null;
        }
        if (this.f125632c == null) {
            Thread.currentThread().getName();
            this.f125631b.unlock();
            return null;
        }
        LongLinkLiveDanmakuMessage.BulletCommentInfo bulletCommentInfo = this.f125632c;
        if (this.f125630a.size() > 0) {
            this.f125632c = this.f125630a.remove(0);
        } else {
            this.f125632c = null;
        }
        bulletCommentInfo.getMasks(0).getOriginUserId();
        bulletCommentInfo.getVideoLiveBulletComment().getContent();
        Thread.currentThread().getName();
        this.f125631b.unlock();
        return bulletCommentInfo;
    }
}
