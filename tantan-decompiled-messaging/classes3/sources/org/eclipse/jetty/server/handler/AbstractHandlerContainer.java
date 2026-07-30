package org.eclipse.jetty.server.handler;

import java.io.IOException;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.HandlerContainer;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.TypeUtil;
import org.eclipse.jetty.util.component.AggregateLifeCycle;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AbstractHandlerContainer extends AbstractHandler implements HandlerContainer {
    public static <T extends HandlerContainer> T findContainerOf(HandlerContainer handlerContainer, Class<T> cls, Handler handler) {
        Handler[] childHandlersByClass;
        if (handlerContainer != null && handler != null && (childHandlersByClass = handlerContainer.getChildHandlersByClass(cls)) != null) {
            for (Handler handler2 : childHandlersByClass) {
                T t = (T) handler2;
                Handler[] childHandlersByClass2 = t.getChildHandlersByClass(handler.getClass());
                if (childHandlersByClass2 != null) {
                    for (Handler handler3 : childHandlersByClass2) {
                        if (handler3 == handler) {
                            return t;
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.Dumpable
    public void dump(Appendable appendable, String str) throws IOException {
        dumpThis(appendable);
        AggregateLifeCycle.dump(appendable, str, getBeans(), TypeUtil.asList(getHandlers()));
    }

    public Object expandChildren(Object obj, Class<?> cls) {
        return obj;
    }

    public Object expandHandler(Handler handler, Object obj, Class<Handler> cls) {
        if (handler == null) {
            return obj;
        }
        if (cls == null || cls.isAssignableFrom(handler.getClass())) {
            obj = LazyList.add(obj, handler);
        }
        if (handler instanceof AbstractHandlerContainer) {
            return ((AbstractHandlerContainer) handler).expandChildren(obj, cls);
        }
        if (!(handler instanceof HandlerContainer)) {
            return obj;
        }
        HandlerContainer handlerContainer = (HandlerContainer) handler;
        return LazyList.addArray(obj, cls == null ? handlerContainer.getChildHandlers() : handlerContainer.getChildHandlersByClass(cls));
    }

    @Override // org.eclipse.jetty.server.HandlerContainer
    public <T extends Handler> T getChildHandlerByClass(Class<T> cls) {
        Object objExpandChildren = expandChildren(null, cls);
        if (objExpandChildren == null) {
            return null;
        }
        return (T) LazyList.get(objExpandChildren, 0);
    }

    @Override // org.eclipse.jetty.server.HandlerContainer
    public Handler[] getChildHandlers() {
        return (Handler[]) LazyList.toArray(expandChildren(null, null), Handler.class);
    }

    @Override // org.eclipse.jetty.server.HandlerContainer
    public Handler[] getChildHandlersByClass(Class<?> cls) {
        return (Handler[]) LazyList.toArray(expandChildren(null, cls), cls);
    }
}
