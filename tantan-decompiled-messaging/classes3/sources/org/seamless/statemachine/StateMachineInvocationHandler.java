package org.seamless.statemachine;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import l.ibe;
import p003l.rhe0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class StateMachineInvocationHandler implements InvocationHandler {
    public static final String METHOD_ON_ENTRY = "onEntry";
    public static final String METHOD_ON_EXIT = "onExit";
    private static Logger log = Logger.getLogger(StateMachineInvocationHandler.class.getName());
    Object currentState;
    final Class initialStateClass;
    final Map<Class, Object> stateObjects = new ConcurrentHashMap();

    public StateMachineInvocationHandler(List<Class<?>> list, Class<?> cls, Class[] clsArr, Object[] objArr) {
        Object objNewInstance;
        log.fine("Creating state machine with initial state: " + cls);
        this.initialStateClass = cls;
        for (Class<?> cls2 : list) {
            if (clsArr != null) {
                try {
                    objNewInstance = cls2.getConstructor(clsArr).newInstance(objArr);
                } catch (NoSuchMethodException e) {
                    rhe0.m7258a("State ", cls2.getName(), " has the wrong constructor: ", e);
                    throw null;
                } catch (Exception e2) {
                    rhe0.m7258a("State ", cls2.getName(), " can't be instantiated: ", e2);
                    throw null;
                }
            } else {
                objNewInstance = cls2.newInstance();
            }
            log.fine("Adding state instance: " + objNewInstance.getClass().getName());
            this.stateObjects.put(cls2, objNewInstance);
        }
        if (!this.stateObjects.containsKey(cls)) {
            ibe.a("Initial state not in list of states: ", cls);
            throw null;
        }
        this.currentState = this.stateObjects.get(cls);
        synchronized (this) {
            invokeEntryMethod(this.currentState);
        }
    }

    private Method getMethodOfCurrentState(Method method) {
        try {
            return this.currentState.getClass().getMethod(method.getName(), method.getParameterTypes());
        } catch (NoSuchMethodException unused) {
            throw new TransitionException("State '" + this.currentState.getClass().getName() + "' doesn't support signal '" + method.getName() + "'");
        }
    }

    private void invokeEntryMethod(Object obj) {
        log.fine("Trying to invoke entry method of state: ".concat(obj.getClass().getName()));
        try {
            obj.getClass().getMethod(METHOD_ON_ENTRY, null).invoke(obj, null);
        } catch (NoSuchMethodException unused) {
            log.finer("No entry method found on state: ".concat(obj.getClass().getName()));
        } catch (Exception e) {
            throw new TransitionException("State '" + obj.getClass().getName() + "' entry method threw exception: " + e, e);
        }
    }

    private void invokeExitMethod(Object obj) {
        log.finer("Trying to invoking exit method of state: ".concat(obj.getClass().getName()));
        try {
            obj.getClass().getMethod(METHOD_ON_EXIT, null).invoke(obj, null);
        } catch (NoSuchMethodException unused) {
            log.finer("No exit method found on state: ".concat(obj.getClass().getName()));
        } catch (Exception e) {
            throw new TransitionException("State '" + obj.getClass().getName() + "' exit method threw exception: " + e, e);
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object obj2;
        synchronized (this) {
            try {
                if (StateMachine.METHOD_CURRENT_STATE.equals(method.getName()) && method.getParameterTypes().length == 0) {
                    return this.currentState;
                }
                if (StateMachine.METHOD_FORCE_STATE.equals(method.getName()) && method.getParameterTypes().length == 1 && objArr.length == 1 && (obj2 = objArr[0]) != null && (obj2 instanceof Class)) {
                    Object obj3 = this.stateObjects.get((Class) obj2);
                    if (obj3 == null) {
                        throw new TransitionException("Can't force to invalid state: " + objArr[0]);
                    }
                    log.finer("Forcing state machine into state: ".concat(obj3.getClass().getName()));
                    invokeExitMethod(this.currentState);
                    this.currentState = obj3;
                    invokeEntryMethod(obj3);
                    return null;
                }
                Method methodOfCurrentState = getMethodOfCurrentState(method);
                log.fine("Invoking signal method of current state: " + methodOfCurrentState.toString());
                Object objInvoke = methodOfCurrentState.invoke(this.currentState, objArr);
                if (objInvoke != null && (objInvoke instanceof Class)) {
                    Class cls = (Class) objInvoke;
                    if (this.stateObjects.containsKey(cls)) {
                        log.fine("Executing transition to next state: ".concat(cls.getName()));
                        invokeExitMethod(this.currentState);
                        Object obj4 = this.stateObjects.get(cls);
                        this.currentState = obj4;
                        invokeEntryMethod(obj4);
                    }
                }
                return objInvoke;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
