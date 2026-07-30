package org.eclipse.jetty.util.component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l.aag0;
import l.x9g0;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AggregateLifeCycle extends AbstractLifeCycle implements Destroyable, Dumpable {
    private static final Logger LOG = Log.getLogger((Class<?>) AggregateLifeCycle.class);
    private final List<Bean> _beans = new CopyOnWriteArrayList();
    private boolean _started = false;

    public class Bean {
        final Object _bean;
        volatile boolean _managed = true;

        public Bean(Object obj) {
            this._bean = obj;
        }

        public String toString() {
            return "{" + this._bean + "," + this._managed + "}";
        }
    }

    public static void dump(Appendable appendable, String str, Collection<?>... collectionArr) throws IOException {
        if (collectionArr.length == 0) {
            return;
        }
        int size = 0;
        for (Collection<?> collection : collectionArr) {
            size += collection.size();
        }
        if (size == 0) {
            return;
        }
        int i = 0;
        for (Collection<?> collection2 : collectionArr) {
            for (Object obj : collection2) {
                i++;
                appendable.append(str).append(" +- ");
                if (obj instanceof Dumpable) {
                    Dumpable dumpable = (Dumpable) obj;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(i == size ? "    " : " |  ");
                    dumpable.dump(appendable, sb.toString());
                } else {
                    dumpObject(appendable, obj);
                }
            }
            if (i != size) {
                appendable.append(str).append(" |\n");
            }
        }
    }

    public static void dumpObject(Appendable appendable, Object obj) throws IOException {
        try {
            if (obj instanceof LifeCycle) {
                appendable.append(String.valueOf(obj)).append(" - ").append(AbstractLifeCycle.getState((LifeCycle) obj)).append("\n");
            } else {
                appendable.append(String.valueOf(obj)).append("\n");
            }
        } catch (Throwable th) {
            appendable.append(" => ").append(th.toString()).append('\n');
        }
    }

    public boolean addBean(Object obj, boolean z) {
        if (contains(obj)) {
            return false;
        }
        Bean bean = new Bean(obj);
        bean._managed = z;
        this._beans.add(bean);
        if (!(obj instanceof LifeCycle)) {
            return true;
        }
        LifeCycle lifeCycle = (LifeCycle) obj;
        if (!z || !this._started) {
            return true;
        }
        try {
            lifeCycle.start();
            return true;
        } catch (Exception e) {
            aag0.a(e);
            return false;
        }
    }

    public boolean contains(Object obj) {
        Iterator<Bean> it = this._beans.iterator();
        while (it.hasNext()) {
            if (it.next()._bean == obj) {
                return true;
            }
        }
        return false;
    }

    public void destroy() {
        ArrayList<Bean> arrayList = new ArrayList(this._beans);
        Collections.reverse(arrayList);
        for (Bean bean : arrayList) {
            if ((bean._bean instanceof Destroyable) && bean._managed) {
                ((Destroyable) bean._bean).destroy();
            }
        }
        this._beans.clear();
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        for (Bean bean : this._beans) {
            if (bean._managed) {
                Object obj = bean._bean;
                if (obj instanceof LifeCycle) {
                    LifeCycle lifeCycle = (LifeCycle) obj;
                    if (!lifeCycle.isRunning()) {
                        lifeCycle.start();
                    }
                }
            }
        }
        this._started = true;
        super.doStart();
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        this._started = false;
        super.doStop();
        ArrayList<Bean> arrayList = new ArrayList(this._beans);
        Collections.reverse(arrayList);
        for (Bean bean : arrayList) {
            if (bean._managed) {
                Object obj = bean._bean;
                if (obj instanceof LifeCycle) {
                    LifeCycle lifeCycle = (LifeCycle) obj;
                    if (lifeCycle.isRunning()) {
                        lifeCycle.stop();
                    }
                }
            }
        }
    }

    public void dumpStdErr() {
        try {
            dump(System.err, "");
        } catch (IOException e) {
            LOG.warn(e);
        }
    }

    public void dumpThis(Appendable appendable) throws IOException {
        appendable.append(String.valueOf(this)).append(" - ").append(getState()).append("\n");
    }

    public <T> T getBean(Class<T> cls) {
        for (Bean bean : this._beans) {
            if (cls.isInstance(bean._bean)) {
                return (T) bean._bean;
            }
        }
        return null;
    }

    public <T> List<T> getBeans(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (Bean bean : this._beans) {
            if (cls.isInstance(bean._bean)) {
                arrayList.add(bean._bean);
            }
        }
        return arrayList;
    }

    public boolean isManaged(Object obj) {
        for (Bean bean : this._beans) {
            if (bean._bean == obj) {
                return bean._managed;
            }
        }
        return false;
    }

    public void manage(Object obj) {
        for (Bean bean : this._beans) {
            if (bean._bean == obj) {
                bean._managed = true;
                return;
            }
        }
        x9g0.a();
    }

    public boolean removeBean(Object obj) {
        for (Bean bean : this._beans) {
            if (bean._bean == obj) {
                this._beans.remove(bean);
                return true;
            }
        }
        return false;
    }

    public void removeBeans() {
        this._beans.clear();
    }

    public void unmanage(Object obj) {
        for (Bean bean : this._beans) {
            if (bean._bean == obj) {
                bean._managed = false;
                return;
            }
        }
        x9g0.a();
    }

    public Collection<Object> getBeans() {
        return getBeans(Object.class);
    }

    public boolean addBean(Object obj) {
        return addBean(obj, ((obj instanceof LifeCycle) && ((LifeCycle) obj).isStarted()) ? false : true);
    }

    public static String dump(Dumpable dumpable) {
        StringBuilder sb = new StringBuilder();
        try {
            dumpable.dump(sb, "");
        } catch (IOException e) {
            LOG.warn(e);
        }
        return sb.toString();
    }

    public void dump(Appendable appendable) throws IOException {
        dump(appendable, "");
    }

    public void dump(Appendable appendable, String str) throws IOException {
        dumpThis(appendable);
        int size = this._beans.size();
        if (size == 0) {
            return;
        }
        int i = 0;
        for (Bean bean : this._beans) {
            i++;
            appendable.append(str).append(" +- ");
            boolean z = bean._managed;
            Object obj = bean._bean;
            if (z) {
                if (obj instanceof Dumpable) {
                    Dumpable dumpable = (Dumpable) obj;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(i == size ? "    " : " |  ");
                    dumpable.dump(appendable, sb.toString());
                } else {
                    dumpObject(appendable, obj);
                }
            } else {
                dumpObject(appendable, obj);
            }
        }
        if (i != size) {
            appendable.append(str).append(" |\n");
        }
    }

    public String dump() {
        return dump(this);
    }
}
