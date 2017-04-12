package com.song;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.List;

import static com.google.common.collect.Iterables.filter;


/**
 * Created by xinyu on 4/12/2017.
 */
public class StateTest {

    private List<State> states;

    @Before
    public void setUp() throws Exception {
        states = Lists.newArrayList();

        states.add(new State("WI", "Wisconsin", "MDW", 5726398));
        states.add(new State("FL", "Florida", "SE", 19317568));
        states.add(new State("IA", "Iowa", "MDW", 3078186));
        states.add(new State("CA", "California", "W", 38041430));
        states.add(new State("NY", "New York", "NE", 19570261));
        states.add(new State("CO", "Colorado", "W", 5187582));
        states.add(new State("OH", "Ohio", "MDW", 11544225));
        states.add(new State("ME", "Maine", "NE", 1329192));
        states.add(new State("SD", "South Dakota", "MDW", 833354));
        states.add(new State("TN", "Tennessee", "SE", 6456243));
        states.add(new State("OR", "Oregon", "W", 3899353));
    }

    Predicate<State> byMDWRegion = new Predicate<State>() {
        public boolean apply(State state) {
            return "MDW".equalsIgnoreCase(state.getRegion());
        }
    };

    @Test
    public void getRegionWithGuava() {
        Collection<State> mdwStates = Collections2.filter(states, byMDWRegion);

        System.out.println(mdwStates);

        Iterable<State> mdwStates1 = Iterables.filter(states, byMDWRegion);
        System.out.println(mdwStates1);

        //https://www.leveluplunch.com/java/examples/guava-iterables-example/
    }

}